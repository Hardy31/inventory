# inventory

add Spring Boot and JPA
Добавил зависимости Spring Boot and JPA


Conversion to UTF-8 CSV For correct display in H2 and IJ
Для того чтобы в В браузере H2 и IJ корректно  открывал CSV файлы необходимо:
    выделить файл File -> File Properties -> Associate with File Type -> Выбрать CSV 
сходный файл CSV онвертировать в кодировку UTF-8.
Конвертировать черех Exel  у меня не получилось.
Конвертировал через Клонвертор онлайн
https://www.virtualbadge.io/resources/utf-8-converter-for-csv-files

Исходный файл 111.csv - перекодированный в UTF-8  encoding-111.csv

После этих манипуляций в H2 и в IJ исходный файл будет корректно отображать килрилицу!!!

 еще! Файл .editorconfig - полезный файл для конфигкрирования отображений, в том числе и для перекодировки.

Кстати сейчас работает все корректно даже при том, что 
параметры File -> Setting -> File Encoding  поля global & progekt проставлены как windows-1251



add Controller, Repository and Entity light version 

