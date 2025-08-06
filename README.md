<div align="center">

# 🚀 Jenkins Shared Libraries

[![Jenkins](https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=Jenkins&logoColor=white)](https://jenkins.io/)
[![Groovy](https://img.shields.io/badge/Groovy-4298B8?style=for-the-badge&logo=Apache%20Groovy&logoColor=white)](https://groovy-lang.org/)
[![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)](https://docker.com/)
[![Stars](https://img.shields.io/github/stars/sayanC04/jenkins-shared-libraries?style=for-the-badge)](https://github.com/sayanC04/jenkins-shared-libraries/stargazers)

<img src="https://raw.githubusercontent.com/jenkins-infra/jenkins.io/master/content/images/logos/jenkins/jenkins.png" width="100" height="100" alt="Jenkins Logo"/>

*Streamline your CI/CD with reusable pipeline magic ✨*

![Pipeline Demo](https://media.giphy.com/media/l0HlBO7eyXzSZkJri/giphy.gif)

</div>

---

## 🎯 What's This About?

Transform your Jenkins pipelines from repetitive scripts to elegant, reusable functions! This library provides battle-tested DevOps functions that make CI/CD a breeze.

---

## ⚡ Quick Start

**1. Add to Jenkins:**
```groovy
@Library('jenkins-shared-libraries') _
```

**2. Start Building:**
```groovy
pipeline {
    agent any
    stages {
        stage('Magic') {
            steps {
                clone('https://github.com/your/repo.git', 'main')
                docker_build('myapp', 'v1.0', 'username')
                docker_push('myapp', 'v1.0', 'username')
                hello('🎉 Deployed successfully!')
            }
        }
    }
}
```

---

## �️ Available Functions

<div align="center">

| Function | Purpose | Example |
|----------|---------|---------|
| 🔄 `clone()` | Git repository cloning | `clone('repo-url', 'main')` |
| 🐳 `docker_build()` | Build Docker images | `docker_build('app', 'v1.0', 'user')` |
| 📤 `docker_push()` | Push to Docker Hub | `docker_push('app', 'v1.0', 'user')` |
| 🚀 `docker_compose()` | Orchestrate containers | `docker_compose()` |
| 💬 `hello()` | Enhanced logging | `hello('Build complete!')` |

</div>

---

## � Real Pipeline in Action

<details>
<summary>👆 Click to see a complete pipeline example</summary>

```groovy
@Library('jenkins-shared-libraries') _

pipeline {
    agent any
    environment {
        APP_NAME = 'awesome-app'
        DOCKER_USER = 'myusername'
    }
    stages {
        stage('🎬 Setup') {
            steps {
                hello('🚀 Starting deployment pipeline...')
                clone('https://github.com/user/awesome-app.git', 'main')
            }
        }
        stage('🏗️ Build') {
            steps {
                docker_build(env.APP_NAME, "${BUILD_NUMBER}", env.DOCKER_USER)
            }
        }
        stage('🚀 Deploy') {
            steps {
                docker_push(env.APP_NAME, "${BUILD_NUMBER}", env.DOCKER_USER)
                docker_compose()
                hello('✅ Deployment successful!')
            }
        }
    }
}
```

</details>

---

## 🔧 Setup

<div align="center">

### Jenkins Configuration

**Dashboard** → **Manage Jenkins** → **Configure System** → **Global Pipeline Libraries**

| Field | Value |
|-------|-------|
| Name | `jenkins-shared-libraries` |
| Default version | `main` |
| Repository URL | `https://github.com/sayanC04/jenkins-shared-libraries.git` |

**Required Credential:** `dockerHubCred` (Username/Password)

</div>

---

## 🤝 Contributing

Found a bug? Want to add a feature? We'd love your help!

1. 🍴 Fork it
2. 🌟 Create your feature branch
3. 💫 Commit your changes
4. 🚀 Push to the branch
5. 🎉 Open a Pull Request

---

<div align="center">

**Made with ❤️ for the DevOps Community**

⭐ **Star this repo if it helped you!** ⭐

<img src="https://media.giphy.com/media/26tn33aiTi1jkl6H6/giphy.gif" width="200" alt="Thank you!"/>

</div>