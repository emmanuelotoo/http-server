# HTTP Server

A lightweight HTTP server implementation built from scratch using Java's `ServerSocket` API. This project demonstrates low-level network programming and HTTP protocol handling without relying on frameworks like Spring or Jakarta EE.


## Prerequisites

- **Java 21 or higher**
- **Maven 3.6+** 

## Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd http-server
```

2. Compile the project:
```bash
mvn compile
```

## Running the Server

```bash
mvn package
java -cp target/classes dev.emmanuelotoo.HttpServerApp
```

The server will start and listen on **`http://localhost:8080`**

## Testing the Server

Once running, test the server using:

**Using a browser:**
Navigate to `http://localhost:8080` in your web browser.

**Expected Response:**
```json
{
    hi im emmanuel
}
```