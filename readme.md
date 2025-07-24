# RecruitBack - 招聘数据分析系统

一个基于 Spring Boot + ECharts 的招聘数据可视化分析平台，提供全面的招聘市场数据洞察。

## 项目概述

本项目是一个完整的招聘数据分析系统，包含后端 API 服务和前端数据可视化界面。系统能够分析招聘市场的各种维度数据，包括行业需求、薪资分布、技能要求、地区差异等，为求职者和招聘方提供数据支持。

## 🏗技术架构

### 后端技术栈
- **框架**: Spring Boot 3.4.7
- **数据库**: MySQL 8.0+
- **ORM**: MyBatis 3.0.4
- **Java版本**: JDK 17
- **构建工具**: Maven
- **其他依赖**: Lombok, MySQL Connector

### 前端技术栈
- **可视化库**: ECharts 5.6.0
- **HTTP客户端**: Axios
- **样式**: 原生 CSS + 响应式设计
- **架构**: 单页面应用 (SPA)

## 项目结构

```
RecruitBack/
├── src/main/java/com/example/recruitback/
│   ├── RecruitBackApplication.java          # 主启动类
│   ├── config/
│   │   └── CorsConfig.java                  # 跨域配置
│   ├── controller/
│   │   └── AnalysisController.java          # 数据分析API控制器
│   ├── mapper/
│   │   └── AnalysisMapper.java              # MyBatis数据访问层
│   ├── pojo/                                # 数据实体类
│   │   ├── IndustryDemand.java              # 行业需求
│   │   ├── SalaryDistribution.java          # 薪资分布
│   │   ├── SkillDemand.java                 # 技能需求
│   │   ├── RegionalSalary.java              # 地区薪资
│   │   ├── EducationSalary.java             # 学历薪资
│   │   ├── ExperienceSalary.java            # 经验薪资
│   │   ├── CompanySizeSalary.java           # 公司规模薪资
│   │   ├── PopularBenefits.java             # 热门福利
│   │   └── HighSalaryJobs.java              # 高薪岗位
│   └── service/
│       ├── AnalysisService.java             # 业务逻辑接口
│       └── implementation/
│           └── AnalysisServiceImpl.java     # 业务逻辑实现
├── src/main/resources/
│   ├── application.yml                      # 应用配置
│   └── mapper/                              # MyBatis映射文件
├── echarts-front/                           # 前端项目
│   ├── index.html                           # 原版前端页面
│   ├── index-axios.html                     # Axios版前端页面
│   └── js/                                  # JavaScript库
│       ├── echarts.js                       # ECharts库
│       └── axios.js                         # Axios库
├── clean_init.sql                           # 数据库初始化脚本
├── import_data.py                           # 数据导入脚本
├── update_database.py                       # 数据库更新脚本
└── pom.xml                                  # Maven配置
```

## 环境要求

### 系统要求
- **操作系统**: Windows 10/11, macOS, Linux
- **Java**: JDK 17+
- **数据库**: MySQL 8.0+
- **Python**: 3.7+ (用于数据导入脚本)

### 开发工具推荐
- **IDE**: IntelliJ IDEA, Eclipse, VS Code
- **数据库管理**: MySQL Workbench, Navicat
- **API测试**: Postman, Apifox

## ⚙安装与配置

### 1. 克隆项目
```bash
git clone 
```

### 2. 数据库配置

#### 创建数据库和用户
```sql
-- 创建数据库
CREATE DATABASE recruitment_analysis CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 创建用户
CREATE USER 'recruit_user'@'localhost' IDENTIFIED BY '000000';
GRANT ALL PRIVILEGES ON recruitment_analysis.* TO 'recruit_user'@'localhost';
FLUSH PRIVILEGES;
```

#### 初始化数据库表
```bash
# 执行数据库初始化脚本
mysql -u recruit_user -p recruitment_analysis < clean_init.sql
```

### 3. 导入数据
```bash
# 使用Python脚本导入CSV数据
python import_data.py

# 或者更新现有数据
python update_database.py
```

### 4. 后端启动
```bash
# 使用Maven启动
mvn spring-boot:run

# 或者编译后运行
mvn clean package
java -jar target/RecruitBack-0.0.1-SNAPSHOT.jar
```

### 5. 前端访问

#### 方式一：直接打开HTML文件
```bash
# 在浏览器中打开
open echarts-front/index-axios.html
```

#### 方式二：使用HTTP服务器
```bash
# 使用Python简单服务器
cd echarts-front
python -m http.server 3000

# 访问 http://localhost:3000/index-axios.html
```

## 🌐 API 接口文档

### 基础信息
- **Base URL**: `http://localhost:8080/api/analysis`
- **Content-Type**: `application/json`
- **跨域**: 已配置 CORS，支持所有域名访问

### 接口列表

| 接口路径 | 方法 | 描述 | 返回数据 |
|---------|------|------|----------|
| `/industries` | GET | 获取热门行业需求 | 行业名称、需求数量 |
| `/salary-distribution` | GET | 获取薪资分布 | 薪资区间、人数分布 |
| `/skills` | GET | 获取热门技能需求 | 技能名称、需求数量 |
| `/regional-salary` | GET | 获取地区薪资水平 | 地区、平均薪资 |
| `/education-salary` | GET | 获取学历薪资关系 | 学历、平均薪资 |
| `/experience-salary` | GET | 获取经验薪资关系 | 工作经验、平均薪资 |
| `/company-size-salary` | GET | 获取公司规模薪资 | 公司规模、平均薪资 |
| `/funding-salary` | GET | 获取融资阶段薪资 | 融资阶段、平均薪资 |
| `/job-type-distribution` | GET | 获取岗位类型分布 | 岗位类型、数量占比 |
| `/posting-trend` | GET | 获取招聘发布趋势 | 时间、发布数量 |
| `/popular-benefits` | GET | 获取热门福利 | 福利类型、提供次数 |
| `/high-salary-jobs` | GET | 获取高薪岗位分析 | 行业、岗位数量、平均薪资 |

### 示例请求
```javascript
// 使用 Axios 获取行业数据
axios.get('http://localhost:8080/api/analysis/industries')
  .then(response => {
    console.log(response.data);
  })
  .catch(error => {
    console.error('请求失败:', error);
  });
```

## 📊 数据可视化功能

### 图表类型
1. **📈 行业需求分析** - 柱状图展示各行业招聘需求
2. **💰 薪资分布统计** - 饼图展示薪资区间分布
3. **🛠️ 技能需求排行** - 横向柱状图展示热门技能
4. **🗺️ 地区薪资对比** - 地图/柱状图展示地区薪资差异
5. **🎓 学历薪资关系** - 折线图展示学历与薪资关系
6. **👔 经验薪资趋势** - 面积图展示经验与薪资趋势
7. **🏢 公司规模分析** - 雷达图展示不同规模公司薪资
8. **🎁 热门福利统计** - 词云图展示热门福利

### 交互功能
- ✅ 响应式设计，支持移动端访问
- ✅ 图表联动和钻取功能
- ✅ 数据筛选和搜索
- ✅ 图表导出功能
- ✅ 实时数据更新
- ✅ 加载状态和错误处理

## 🔍 使用说明

### 启动系统
1. 确保 MySQL 服务运行
2. 启动后端服务：`mvn spring-boot:run`
3. 打开前端页面：`echarts-front/index-axios.html`
4. 系统将自动加载数据并展示图表

### 数据更新
```bash
# 更新数据库数据
python update_database.py

# 重启后端服务以刷新缓存
mvn spring-boot:run
```

### 自定义配置

#### 修改数据库连接
编辑 `src/main/resources/application.yml`：
```yaml
spring:
  datasource:
    url: jdbc:mysql://your-host:3306/your-database
    username: your-username
    password: your-password
```

#### 修改服务端口
```yaml
server:
  port: 8080  # 修改为你需要的端口
```

## 🚀 部署指南

### 开发环境部署
```bash
# 后端
mvn spring-boot:run

# 前端
cd echarts-front
python -m http.server 3000
```

### 生产环境部署

#### 后端部署
```bash
# 打包
mvn clean package -Dmaven.test.skip=true

# 运行
java -jar target/RecruitBack-0.0.1-SNAPSHOT.jar

# 或使用 nohup 后台运行
nohup java -jar target/RecruitBack-0.0.1-SNAPSHOT.jar > app.log 2>&1 &
```

#### 前端部署
```bash
# 使用 Nginx 部署
sudo cp -r echarts-front/* /var/www/html/
sudo systemctl restart nginx
```

### Docker 部署（推荐）
```dockerfile
# Dockerfile
FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/RecruitBack-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
```

```bash
# 构建和运行
docker build -t recruit-back .
docker run -p 8080:8080 recruit-back
```

## 🛠️ 开发指南

### 添加新的数据分析接口

1. **创建实体类**
```java
// src/main/java/com/example/recruitback/pojo/NewAnalysis.java
@Data
public class NewAnalysis {
    private String name;
    private Integer count;
    // getter/setter
}
```

2. **添加 Mapper 方法**
```java
// AnalysisMapper.java
List<NewAnalysis> getNewAnalysis();
```

3. **实现 Service 方法**
```java
// AnalysisServiceImpl.java
@Override
public List<NewAnalysis> getNewAnalysis() {
    return analysisMapper.getNewAnalysis();
}
```

4. **添加 Controller 接口**
```java
// AnalysisController.java
@GetMapping("/new-analysis")
public List<NewAnalysis> getNewAnalysis() {
    return analysisService.getNewAnalysis();
}
```

### 添加新的图表

1. **在前端添加按钮**
```html
<button class="btn" onclick="loadChart('newChart')" id="btn-new">
    🆕 新分析
</button>
```

2. **实现加载函数**
```javascript
function loadNewChart() {
    showLoading();
    axios.get(`${API_BASE_URL}/new-analysis`)
        .then(response => {
            const option = {
                // ECharts 配置
            };
            chart.setOption(option);
            hideLoading();
        })
        .catch(error => {
            handleError('加载新分析数据失败', error);
        });
}
```

## 🐛 常见问题

### Q1: 数据库连接失败
**A**: 检查以下配置：
- MySQL 服务是否启动
- 数据库用户名密码是否正确
- 数据库是否存在
- 防火墙设置

### Q2: 前端无法获取数据
**A**: 检查以下问题：
- 后端服务是否启动（端口8080）
- CORS 配置是否正确
- 网络连接是否正常
- 浏览器控制台是否有错误信息

### Q3: 图表显示异常
**A**: 可能的原因：
- 数据格式不正确
- ECharts 配置错误
- 容器尺寸问题
- 浏览器兼容性

### Q4: 数据导入失败
**A**: 检查：
- CSV 文件路径是否正确
- 文件编码是否为 UTF-8
- 数据库表结构是否匹配
- Python 依赖是否安装

## 📝 更新日志

### v1.0.0 (2025-01-23)
- ✅ 完成基础的招聘数据分析功能
- ✅ 实现 12 个核心数据分析接口
- ✅ 完成 ECharts 数据可视化界面
- ✅ 集成 Axios 进行前后端交互
- ✅ 支持响应式设计和移动端访问
- ✅ 添加完整的错误处理和加载状态

## 🤝 贡献指南

1. Fork 本项目
2. 创建特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 打开 Pull Request

## 📄 许可证

本项目采用 MIT 许可证 - 查看 [LICENSE](LICENSE) 文件了解详情。

## 👥 联系方式

- **项目维护者**: [Your Name]
- **邮箱**: [your.email@example.com]
- **项目地址**: [GitHub Repository URL]

## 🙏 致谢

感谢以下开源项目的支持：
- [Spring Boot](https://spring.io/projects/spring-boot)
- [ECharts](https://echarts.apache.org/)
- [Axios](https://axios-http.com/)
- [MyBatis](https://mybatis.org/)
- [MySQL](https://www.mysql.com/)

---

**⭐ 如果这个项目对你有帮助，请给它一个 Star！**
        
