# Aspect Oriented Programming Springboot

This project demonstrates **Aspect Oriented Programming (AOP)** concepts using **Spring Boot**.

It showcases how cross-cutting concerns like **logging** and **performance tracking** can be separated from the business logic using Spring AOP annotations like `@Before`, `@After`, `@AfterReturning`, `@AfterThrowing`, and `@Around`.

---

## 🛠️ Technologies Used
- Java
- Spring Boot
- Spring AOP
- SLF4J (Logging)

---

## 📂 Project Structure

| Layer | Purpose | Key Classes |
|:---|:---|:---|
| **Application Layer** | Entry point to the application | `LearnSpringAopApplication` |
| **Business Layer** | Contains business logic | `BusinessService1`, `BusinessService2` |
| **Data Layer** | Simulates data retrieval | `DataService1`, `DataService2` |
| **Aspect Layer** | Contains cross-cutting concerns | `LoggingAspect`, `PerformanceTrackingAspect` |

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/learn-spring-aop.git
