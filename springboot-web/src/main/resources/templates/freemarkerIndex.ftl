<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8"/>
    <title>123</title>
</head>
<body>
  ${name}

<#if sex=='0'>
    男
<#elseif sex =='1'>
    女
<#else>
    其他
</#if>

<#if age gt 17>
      已经成年
<#else>
      未成年
</#if>

<#list userList as user>
    ${user}
</#list>
</body>
</html>