<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Items</title>
    <style>
        .table-center{
            display: flex;
            place-content: center;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
    <h1>Hello, items!</h1>

    <div class="table-center">
    <div class="table-center" style="width: 80%; display: flex; align-content: center" >
    <table class="table table-dark table-striped">
        <thead>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Created At</th>
            <th>Updated At</th>
            <th>EDIT</th>
            <th>DELETE</th>
        </thead>
        <tbody>
            <#list items as item>
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.description}</td>
                    <td>${item.createdAt}</td>
                    <td>${item.updatedAt}</td>
                    <td><a href="/ui/v1/items/edit/${item.id}"><button class="btn btn-warning">Edit</button></a></td>
                    <td><a href="/ui/v1/items/del/${item.id}"><button class="btn btn-danger">Delete</button></a></td>
                </tr>
            </#list>
        </tbody>
    </table>
    </div>
    </div>

    <a href="/ui/v1/items/add">CREATE</a>
</body>
</html>