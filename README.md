# Trade Monitor Dashboard

A full-stack Trade Monitoring Dashboard built using AngularJS and Spring Boot. This application allows users to view, filter, and analyze trade data in real-time through a clean and interactive UI.

---

## 🚀 Features

- View trades in a dashboard table
- Filter trades by **status** and **product**
- Real-time summary cards:
  - Total Trades
  - Pending
  - Settled
  - Cancelled
- REST API integration between frontend and backend
- CI/CD pipeline using GitHub Actions

---

## 🛠️ Tech Stack

### Frontend
- AngularJS (1.x)
- HTML5, CSS3
- Bootstrap

### Backend
- Java 17
- Spring Boot
- REST APIs

### DevOps & Tools
- Git & GitHub
- GitHub Actions (CI/CD)
- Maven

## 📂 Project Structure
trade-monitor-dashboard/
├── backend/ # Spring Boot application
├── frontend/ # AngularJS application
└── README.md

## ▶️ How to Run Locally

### 🔹 Backend (Spring Boot)

cd backend
mvn spring-boot:run

Backend runs on:
http://localhost:8080/api/trades

🔹 Frontend (AngularJS)  
npx http-server -c-1

Open in browser:
http://127.0.0.1:8082/#!/dashboard

🔄 CI/CD (GitHub Actions)

This project uses GitHub Actions for continuous integration.

Pipeline includes:
Backend build and test using Maven
Frontend structure validation
Runs automatically on:
Push to main
Feature branches
Pull requests
