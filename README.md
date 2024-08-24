## Requirements

- Java 17 or higher
- Maven 3.6 or higher
- MySQL or any compatible database
- Postman or `curl` for API testing

## Installation

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/supplier-search-api.git
cd supplier-search-api
```
### 2. Install Dependencies
```
mvn clean install
```
### 3. Run Server
```
mvn spring-boot:run
```
API Documentation 

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Supplier Search API Documentation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f9f9f9;
        }
        h1 {
            color: #333;
        }
        h2 {
            color: #555;
        }
        p {
            color: #666;
        }
        .code-block {
            background-color: #f4f4f4;
            border: 1px solid #ccc;
            padding: 10px;
            margin: 20px 0;
            overflow-x: auto;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 12px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<h1>Supplier Search API Documentation</h1>

<h2>Endpoint: <code>/api/supplier/query</code></h2>
<p><strong>Method:</strong> POST</p>
<p><strong>Description:</strong> This endpoint allows you to search for suppliers based on specific criteria such as location, nature of business, and manufacturing processes. You can also limit the number of results returned.</p>

<h2>Request Parameters:</h2>
<table>
    <tr>
        <th>Parameter</th>
        <th>Type</th>
        <th>Required</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>location</td>
        <td>String</td>
        <td>Yes</td>
        <td>The location of the supplier. Example: <code>New York</code></td>
    </tr>
    <tr>
        <td>natureOfBusiness</td>
        <td>String</td>
        <td>Yes</td>
        <td>The nature of business. Example: <code>Electronics</code>, <code>Automotive</code></td>
    </tr>
    <tr>
        <td>manufacturingProcesses</td>
        <td>String</td>
        <td>Yes</td>
        <td>The manufacturing process. Example: <code>3D Printing</code>, <code>Casting</code></td>
    </tr>
    <tr>
        <td>limit</td>
        <td>int</td>
        <td>No</td>
        <td>The maximum number of results to return. Default is <code>10</code>.</td>
    </tr>
</table>

<h2>Example Request:</h2>
<div class="code-block">
    <p><strong>URL:</strong></p>
    <pre>http://localhost:8080/api/supplier/query</pre>

    <p><strong>Headers:</strong></p>
    <pre>Content-Type: application/json</pre>

    <p><strong>Body:</strong></p>
    <pre>{
    "location": "New York",
    "natureOfBusiness": "Electronics",
    "manufacturingProcesses": "Injection Molding",
    "limit": 10
}</pre>
</div>

<h2>Response:</h2>
<h3>Success (200 OK):</h3>
<div class="code-block">
        <pre>[
    {
        "supplierId": 1,
        "companyName": "ABC Manufacturing",
        "website": "http://www.abcmanufacturing.com",
        "location": "New York",
        "natureOfBusiness": "Electronics",
        "manufacturingProcesses": "Injection Molding"
    }
]</pre>
</div>

<h3>Empty Result (200 OK):</h3>
<div class="code-block">
    <pre>[]</pre>
</div>

<h3>Error (400 Bad Request):</h3>
<div class="code-block">
        <pre>{
    "error": "Invalid request parameters"
}</pre>
</div>

<h2>Sample CURL Command:</h2>
<div class="code-block">
        <pre>curl -X POST http://localhost:8080/api/supplier/query \
-H "Content-Type: application/json" \
-d '{
    "location": "New York",
    "natureOfBusiness": "Electronics",
    "manufacturingProcesses": "Injection Molding",
    "limit": 10
}'</pre>
</div>

<h2>Notes:</h2>
<ul>
    <li><strong>Pagination:</strong> If the <code>limit</code> is exceeded, the results will be truncated.</li>
    <li><strong>Input Validation:</strong> Ensure all required parameters are provided and correctly formatted.</li>
    <li><strong>Security Considerations:</strong> Consider implementing authentication and authorization if needed.</li>
</ul>

</body>
</html>

