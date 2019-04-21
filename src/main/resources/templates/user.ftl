<#import "parts/common.ftl" as c>

<@c.page "none">

<div class="wrapper">
    <form method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <div style="padding-top: 57px">
            <table class="table table-bordered" >
                <thead >
                <tr>
                    <th scope="col"><input type="checkbox" class="custom-control-input chk-all" name="user"></th>
                    <th scope="col">Username</th>
                    <th scope="col">Password</th>
                    <th scope="col">FIO</th>
                    <th scope="col">phone</th>
                    <th scope="col">email</th>
                    <th scope="col">Role</th>
                    <#--<th scope="col">is active</th>-->
                </tr>
                </thead>
                <tbody>
                <#--{% for user in users_list %}-->
                <#list users as user>
                <tr>
                    <th><input type="checkbox" class="custom-control-input" name="user" value="${ user.id }"></th>
                    <td>${user.username}</td>
                    <td>${ user.password}</td>
                    <td>${ user.FIO}</td>
                    <td>${ user.phone}</td>
                    <td>${ user.email}</td>

                    <td><#list user.roles as role>${role}<#sep>, </#list></td>
                </tr>
                </#list>
                <#--{% endfor %}-->
                </tbody>
            </table>
        </div>
    </form>

</div>

<script type="text/javascript">
    $(document).on('change', 'input[type=checkbox]', function () {
        var $this = $(this), $chks = $(document.getElementsByName(this.name)), $all = $chks.filter(".chk-all");

        if ($this.hasClass('chk-all')) {
            $chks.prop('checked', $this.prop('checked'));
        } else switch ($chks.filter(":checked").length) {
            case +$all.prop('checked'):
                $all.prop('checked', false).prop('indeterminate', false);
                break;
            case $chks.length - !!$this.prop('checked'):
                $all.prop('checked', true).prop('indeterminate', false);
                break;
            default:
                $all.prop('indeterminate', true);
        }
    });
</script>

<#--List of users-->

<#--<table>-->
    <#--<thead>-->
    <#--<tr>-->
        <#--<th>Name</th>-->
        <#--<th>Role</th>-->
        <#--<th></th>-->
    <#--</tr>-->
    <#--</thead>-->
    <#--<tbody>-->
    <#--<#list users as user>-->
    <#--<tr>-->
        <#--<td>${user.username}</td>-->
        <#--<td><#list user.roles as role>${role}<#sep>, </#list></td>-->
        <#--<td><a href="/user/${user.id}">edit</a></td>-->
    <#--</tr>-->
    <#--</#list>-->
    <#--</tbody>-->
<#--</table>-->
</@c.page>