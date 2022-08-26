<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Agents</title>
    <#include "style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<header class="title">
    <h1>All Agents</h1>
</header>

<div class="main">
    <div class="menu">
        <div class="menu-item">
            <a href="http://localhost:8080/ui/v1/items/" class="item">Get Items</a>
        </div>
        <div class="menu-item">
            <a href="http://localhost:8080/ui/v1/agents/" class="item">Get Agents</a>
        </div>
        <div class="menu-item">
            <a href="http://localhost:8080/ui/v1/branches/" class="item">Get Branches</a>
        </div>
        <div class="menu-item">
            <a href="http://localhost:8080/ui/v1/clients/" class="item">Get Clients</a>
        </div>
        <div class="menu-item">
            <a href="http://localhost:8080/ui/v1/contracts/" class="item">Get Contracts</a>
        </div>
        <div class="menu-item">
            <a href="http://localhost:8080/ui/v1/insuranceTypes/" class="item">Get Insurance Types</a>
        </div>
        <div class="menu-item">
            <a href="http://localhost:8080/ui/v1/salarys/" class="item">Get Salary</a>
        </div>
        <div class="menu-item">
            <a href="http://localhost:8080/ui/v1/branchLogs/" class="item">Get branch logs</a>
        </div>
        <div class="menu-item">
            <a href="http://localhost:8080/ui/v1/contractLogs/" class="item">Get contract logs</a>
        </div>
    </div>
    <div class="create-button">
        <a href="/ui/v1/agents/add" class="item"><button type="button" class="btn btn-success">Create</button></a>
    </div>
    <div class="content table-wrapper-scroll-y my-custom-scrollbar">
        <table class="table table-success table-striped">
            <thead>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Created At</th>
            <th>Updated At</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Patronymic</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Fix Salary</th>
            <th>EDIT</th>
            <th>DELETE</th>
            </thead>
            <tbody>
            <#list agents as agent>
                <tr>
                    <td>${agent.id}</td>
                    <td>${agent.name}</td>
                    <td>${agent.description}</td>
                    <td>${agent.createdAt}</td>
                    <td>${agent.updatedAt}</td>
                    <td>${agent.firstName}</td>
                    <td>${agent.lastName}</td>
                    <td>${agent.patronymic}</td>
                    <td>${agent.address}</td>
                    <td>${agent.phone}</td>
                    <td>${agent.fixSalary/100}</td>
                    <td><a href="/ui/v1/agents/edit/${agent.id}"><button class="btn btn-warning">Edit</button></a></td>
                    <td><a href="/ui/v1/agents/del/${agent.id}"><button class="btn btn-danger">Delete</button></a></td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
</div>

<footer class="down">

</footer>

</body>
</html>