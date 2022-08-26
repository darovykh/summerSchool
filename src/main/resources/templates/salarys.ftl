<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Salary</title>
    <#include "style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<header class="title">
    <h1>All salary logs</h1>
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
        <a href="/ui/v1/salarys/add" class="item"><button type="button" class="btn btn-success">Create</button></a>
    </div>
    <div class="content table-wrapper-scroll-y my-custom-scrollbar">
        <table class="table table-success table-striped">
            <thead>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Created At</th>
            <th>Updated At</th>
            <th>Agent Id</th>
            <th>Agent First Name</th>
            <th>Agent Last Name</th>
            <th>Salary</th>
            <th>Contract Bonus</th>
            <th>Fix Salary</th>
            <th>From</th>
            <th>To</th>
            <th>EDIT</th>
            <th>DELETE</th>
            </thead>
            <tbody>
            <#list salarys as salary>
                <tr>
                    <td>${salary.id}</td>
                    <td>${salary.name}</td>
                    <td>${salary.description}</td>
                    <td>${salary.createdAt}</td>
                    <td>${salary.updatedAt}</td>
                    <td>${salary.agent.id}</td>
                    <td>${salary.agent.firstName}</td>
                    <td>${salary.agent.lastName}</td>
                    <td>${salary.salary}</td>
                    <td>${salary.contractBonus}</td>
                    <td>${salary.agent.fixSalary/100}</td>
                    <td>${salary.from}</td>
                    <td>${salary.to}</td>
                    <td><a href="/ui/v1/salarys/edit/${salary.id}"><button class="btn btn-warning">Edit</button></a></td>
                    <td><a href="/ui/v1/salarys/del/${salary.id}"><button class="btn btn-danger">Delete</button></a></td>
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