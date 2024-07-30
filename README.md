## Introduction

This application is built to manage products. It allows users to create new products, view a list of products, update product details, delete products and search products by name.

## Technologies Used

- Spring Web
- Lombok
- Thymeleaf
- Spring Data JPA
- H2 Database

## Project Setup

### Prerequisites

- Java
- Maven

### Steps

1. Clone the repository:
   ```bash
   git clone  https://github.com/Monaseka-ROEUY/Springboot-CRUD-Thymeleaf.git
   cd product-crud-thymeleaf
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`.

## Running the Application

Once the application is running, you can access it at `http://localhost:8080/products`. You will see a homepage where you can navigate to different sections of the application.

## Features

- **Create Product**: Add a new product like name, imageUrl, description, and price.
- **Read Products**: View a list of all products.
- **Update Product**: Edit the details of an existing product.
- **Delete Product**: Remove a product from the list.
- **Search products**: search any products by name.

## Screenshots

### Home Page
![](https://github.com/Monaseka-ROEUY/Springboot-CRUD-Thymeleaf/blob/main/src/main/resources/screenshorts/home.png)

### Create Product
![](https://github.com/Monaseka-ROEUY/Springboot-CRUD-Thymeleaf/blob/main/src/main/resources/screenshorts/create.png)

### Edit Product
![](https://github.com/Monaseka-ROEUY/Springboot-CRUD-Thymeleaf/blob/main/src/main/resources/screenshorts/edit.png)

### Search Product by name
![](https://github.com/Monaseka-ROEUY/Springboot-CRUD-Thymeleaf/blob/main/src/main/resources/screenshorts/iphone.png)
![](https://github.com/Monaseka-ROEUY/Springboot-CRUD-Thymeleaf/blob/main/src/main/resources/screenshorts/samsung.png)
