<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit Contract</title>
    <#include "style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<header class="title">
    <h1>Edit contract</h1>
</header>

<div class="main">
    <fieldset class="input-block">
        <form name="item" action="" method="POST">
            <div class="inside-form">
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
                    sum insured:
                    <div class="input-item-d">
                        <@spring.formInput "form.sumInsured" "" "number"/>
                    </div>
                </div>
                <div class="input-item">
                    tariff rate:
                    <div class="input-item-d">
                        <@spring.formInput "form.tariffRate" "" "number"/>
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