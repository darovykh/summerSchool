<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Contract Logs</title>
  <#include "style.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<header class="title">
  <h1>All contract logs</h1>
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
      <a href="http://localhost:8080/ui/v1/contractLogs/contractLogs.ftl" class="item">Get contract logs</a>
    </div>
  </div>
  <div class="create-button">
    <a href="/ui/v1/items/add" class="item"><button type="button" class="btn btn-success">Create</button></a>
  </div>
  <div class="content table-wrapper-scroll-y my-custom-scrollbar">
    <table class="table table-success table-striped">
      <thead>
      <th>ID</th>
      <th>Name</th>
      <th>Description</th>
      <th>Created At</th>
      <th>Updated At</th>
      <th>Client id</th>
      <th>Client first name</th>
      <th>Client last name</th>
      <th>Agent id</th>
      <th>Agent first name</th>
      <th>Agent last name</th>
      <th>Contract id</th>
      <th>Signing branch id</th>
      <th>Signing branch name</th>
      <th>Insurance type id</th>
      <th>Insurance type name</th>
      <th>EDIT</th>
      <th>DELETE</th>
      </thead>
      <tbody>
      <#list contractLogs as contractLog>
      <tr>
        <td>${contractLog.id}</td>
        <td>${contractLog.name}</td>
        <td>${contractLog.description}</td>
        <td>${contractLog.createdAt}</td>
        <td>${contractLog.updatedAt}</td>
        <td>${contractLog.client.id}</td>
        <td>${contractLog.client.firstName}</td>
        <td>${contractLog.client.lastName}</td>
        <td>${contractLog.agent.id}</td>
        <td>${contractLog.agent.firstName}</td>
        <td>${contractLog.agent.lastName}</td>
        <td>${contractLog.contract.id}</td>
        <td>${contractLog.whereContactWasSigned.id}</td>
        <td>${contractLog.whereContactWasSigned.title}</td>
        <td>${contractLog.insuranceType.id}</td>
        <td>${contractLog.insuranceType.typeName}</td>
        <td><a href="/ui/v1/contractLogs/edit/${contractLog.id}"><button class="btn btn-warning">Edit</button></a></td>
        <td><a href="/ui/v1/contractLogs/del/${contractLog.id}"><button class="btn btn-danger">Delete</button></a></td>
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