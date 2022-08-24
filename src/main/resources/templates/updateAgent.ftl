<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit Agent</title>
    <#include "style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<header class="title">
    <h1>Edit agent</h1>
</header>

<div class="main">
    <fieldset class="input-block">
        <form name="item" action="" method="POST">
            <div class="inside-form">
                <div class="first-column">
                <div class="input-item">
                    id:
                    <div class="input-item-d">
                        <@spring.formInput "form.id" "" "text"/>
                    </div>
                </div>
                <div class="input-item">
                    name:
                    <div class="input-item-d">
                        <@spring.formInput "form.name" "" "text"/>
                    </div>
                </div>
                <div class="input-item">
                    description:
                    <div class="input-item-d">
                        <@spring.formInput "form.description" "" "text"/>
                    </div>
                </div>
                <div class="input-item">
                    created:
                    <div class="input-item-d">
                        <@spring.formInput "form.createdAt" "" "date"/>
                    </div>
                </div>
                <div class="input-item">
                    updated:
                    <div class="input-item-d">
                        <@spring.formInput "form.updatedAt" "" "date"/>
                    </div>
                </div>
                <div class="input-item">
                    first name:
                    <div class="input-item-d">
                        <@spring.formInput "form.firstName" "" "text"/>
                    </div>
                </div>
                <div class="input-item">
                    last name:
                    <div class="input-item-d">
                        <@spring.formInput "form.lastName" "" "text"/>
                    </div>
                </div>
                <div class="input-item">
                    patronymic:
                    <div class="input-item-d">
                        <@spring.formInput "form.patronymic" "" "text"/>
                    </div>
                </div>
                </div>
                    <div class="second-column">
                        <div class="input-item">
                    address:
                    <div class="input-item-d">
                        <@spring.formInput "form.address" "" "text"/>
                    </div>
                </div>
                <div class="input-item">
                    phone:
                    <div class="input-item-d">
                        <@spring.formInput "form.phone" "" "text"/>
                    </div>
                </div>
                <div class="input-item">
                    fix salary:
                    <div class="input-item-d">
                        <@spring.formInput "form.fixSalary" "" "number"/>
                    </div>
                </div>
                </div>
            </div>
            <div class="edit-button">
                <input class="btn btn-warning" type="submit" value="Edit">
            </div>
        </form>
    </fieldset>
</div>
<footer class="down">

</footer>
</body>
</html>