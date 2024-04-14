@REM 生成指定大小的文件
@REM 使用fsutil命令：Windows提供了一个名为fsutil的命令行工具，可以用来创建一个指定大小的文件。打开命令提示符（CMD）并输入以下命令：
@REM fsutil file createnew filename length
@REM 其中filename是你想要创建的文件的名称，length是文件的大小（以字节为单位）。例如，创建一个100MB的文件：
@REM fsutil file createnew testfile.bin 104857600

fsutil file createnew .\lol.exe 1024000
