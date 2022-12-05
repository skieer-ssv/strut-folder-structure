# Basic Strut Folder Structure that works!

I have Arrived at this structure by trial and error kindly send in a pull req if you notice any corrections or improvements.

### Root has 2 main folders
1. src
2. Web (This can be named anything)

### Folder ```src```
- Contains ```struts.xml``` at it's root.
- Contains java classes as per the normal folder structure.
- main parent directory of java classes inside src cannot be name ```java``` 

> #### File ```struts.xml```
>- ```class``` attribute inside the *action tag* must contain proper path of the java file.
>- ```name``` attribute inside *result tag* must be same as the string returned by the action.
> 

### Folder ```Web```
- Contains ```web.xml``` inside the ```WEB-INF``` folder.
- different folders for frontend pages and assets can be made just remember not to add ```/``` before the path of these resources
e.g. use ```<img src="assets/food.jpg">``` instead of ```<img src="/assets/food.jpg">```


