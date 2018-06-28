# Java_Tools
Java的一些常用的工具的封装（例如对文件的操作，数据格式的转换），尽量减少写重复代码的时间。

#1TransformTool格式转换工具
##1.1 1resultSet2Json
将数据库查询结果返回的resultSet转换成Json格式的字符串。

通常你可以这样使用：

在做web project时，前端很多时候需要Json格式的数据，那么你可以直接将经过转换之后数据传到前端或者Servlet中进行处理。

