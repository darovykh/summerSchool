<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Item</title>
</head>
<body>
    <h1>Add new item</h1>

    <div>
        <fieldset>
            <form name="item" action="" method="POST">
                name:<@spring.formInput "form.name" "" "text"/>
                <br>
                description:<@spring.formInput "form.description" "" "text"/>
                <br>
                <input type="submit" value="Create">
            </form>
        </fieldset>
    </div>
</body>
</html>