# 此仓库将记录本菜鸡从0开始学习JAVA的所有过程

[第一章代码链接](https://github.com/Yujunliu95/RE0_JAVA/tree/master/1.0-2.0)
<details>
<summary>第一章-超级基础</summary>

## 1.1 Helloworld
    1. 关键字: public, static void, class
    2. 标识符不能数字开头，不能是关键字
    
## 1.2 常量
    1. 字符串常量：用双引号。"123" = 字符串123
    2. 整数常量： 直接写上数字（无小数点）
    3. 浮点数常量： 有小数点
    4. 字符常量：单引号'A','9', '中文'。
    5. Boolean常量：T/F
    6. NULL
    
## 1.2.1 数据类型
    1. 整数：byte short int long
    2. 浮点：float(4字节) double（8字节）
    3. 字符: char
    4. boolean（t/f）
    
 ## 1.2.2 引用数据类型
    1. 字符串，数组，类，借口，Lambda
    2. 小数默认double类型，整数默认int类型

## 1.3 变量
    1. 数据类型 变量名称； // 创建一个变量
    2. 变量名称 = 数据值； // 赋值
    3. 数据类型 变量名称 = 数据值

## 1.4 注意事项
    1. 多个变量名不能重复
    2. float跟long类型，后缀不能丢
    3. byte或者short，要在范围内
    4. 要进行赋值才能用
    5. 不能超出{}的作用域
    6.不推荐1行创建多个变量

## 1.5 数据类型转换(Demo02_datatype)
    1. 类型不一样就会转换
    2. 自动类型转换
        1. 代码不需要处理
        2. 规则: 数据范围从小到大，例 long num1 = 100；
        int ----> long
    3. 强制类型转换
        1.代码要格式处理
        2.格式：范围小的类型（int） = (范围小的类型）原本大范围的数据
        3.可能造成数据损失、溢出
        4. char类型进行数学运算，字符会按照规则翻译成数字
        例：byte/short/char 运算会被提升成int类型，然后再计算。
        int num2 = (int) 6000000000L;
        5.Boolean不能转换

## 1.5.1 ASCII编码表 (Demo03)
    1. 48 --> 0
    2. 65 --> A
    3. 97 --> a

## 1.6 运算符
    1. + - * / 四则运算
    2. ++   -- 
    3. 除法：对于整数表达式。整数/整数 不看余数
    4. 取余数：%
    
## 1.6.1 加号‘+’用法 （demo05plus）
    1. 对于数值就是加法
    2. 对于字符char，char会被提升成int，再进行计算
    3. 对于String（首字母大写，不是关键字）来说，+代表字符串
    的链接操作
    4. String + int ---> String

## 1.6.2 自增/自减
    1. 让一个变量涨一个数字/降一个数字, 例子num++
    2. 单独使用： 前++和后++没有区别
    3. 混合使用，有【重大区别】
        A. 如果前++，变量马上+1，以结果进行使用 【先加后用】
        B. 如果是后++，首先使用变量的值，再+1   【先用后加】
    4. 只有变量才能使用自增、自减运算符。

## 1.6.3 符合运算符 (demo07)
    1. +=    a += 1 相当于 a = a + 1
    2. -=    b -= 4 相当于 b = b - 4
    3. *=    c = c * 
    4. /=    d = d / 6
    5. %=    e = e % 7
    注意：只限变量，常量不行
    包含一个强制类型转换
    
## 1.6.4 比较运算符
    1.太简单的就不写了

## 1.6.5 逻辑运算符 (demo09logic)
    1. 与（并且）&&
    2. 或 (或者）||
    3. 取反 ！

## 1.6.6 三元运算符（demo10operator）
    1.一元: 只需要一个数据就可以进行操作，例 ！、++、--
    2.二元： 需要两个数据才可以操作 例如： +, = 
    3.三元：需要3个数据
    格式：
    数据类型 变量名称 = 条件判断 ？ 表达式A:表达式B
    
    流程：
    首先判断条件是否成立：
    如果成立为true，那么将表达式A的值赋值给左侧的变量
    如果不成立为false，那么将表达式B的值赋值给左边变量
    二者选一

## 1.7 方法入门（demo11method）
    1. 定义方法格式: 
    public static void 方法名称() {
        方法体
    }
    注意事项：
    1. 方法定义先后顺序无所谓
    2. 方法定义不能产生嵌套包含关系
    3. 方法定义好，不会执行，如果要执行，一定要调用
    
## 1.7.1 方法的调用
    格式：方法名称（）；
    跟python的def（）感觉一样
    
## 1.8 Jshell
    跟python ide差不多

## 1.8.1 编译器优化（demo12notice）
    int--->byte 不是自动类型转换
    1.右侧没有超过左侧范围，编译器强转
    2.右侧超过范围，报错
    int ----> char, 没有超过范围
    编译器将会自动补上一个隐含的（char）
    
    short result = 5 + 8 // 等号右边都是常量
    右侧常量只要不超过左侧范围，就叫‘编译器的常量优化’
    
    
    
</details>

[第二章代码链接](https://github.com/Yujunliu95/RE0_JAVA/tree/master/2.0-3.0)

<details>
<summary>第二章-流程及循环</summary>

## 2.1 顺序结构 - if (Demo03)
    1.单if
    2.标准 if - else
    3.扩展 if - else
    
## 2.2 if 替换三元运算符 （demo04）

## 2.3 选择结构-switch（关键字）
    1.标准switch（demo05）
    2.特殊switch（demo06）
    注意事项：
    1. 多个case后面的数值不可以重复。
    2. 小括号只能是基本数据类型：byte/short/char/int
    或者应用数据类型: String字符串/enum
    
    3. “匹配哪一个case，就从哪一个位置向下执行（直到遇到break）。"

## 2.4 For循环 (demo07)
    循环结构的4部分：
    1. 初始化语句，开始执行，只做一次。
    2. 条件判断，成立则继续，不成立则退出。
    3. 循环体，重复要做的事情内容，若干行。
    4. 步进语句：每次循环之后要进行的扫尾工作，每次循环结束都要执行一次

    for (初始化表达式 1 ，boolean表达2 ，步进表达4 ）{
            循环体3
        } 
    顺序1234 -> 234> 234> 234..到2不满足为止


## 2.4.1 while循环（demo08）
    1.标准格式
    while(条件判断）{
    循环体
    }
    
    2. 扩展格式
    初始化语句 1 ;
    while (条件判断2 ) {
        循环体3 ;
        步进语句4 ;
    }
    顺序1234.
    
## 2.4.2 do-while循环 (demo09)
    1. 标准格式:
    do {
        循环体
    } while(条件判断);

    2. 扩展格式:
    初始化表达
        do{
        循环体
        步进表达式
        }   while(Boolean表达式);

## 练习，求1-100的偶数和 （practice1）
    1.判断偶数 num % 2 == 0

## 2.5 三种循环的区别
    1. 如果条件判断从来没有满足过，那么for循环和while会执行0次，
    但是do-while会至少执行一次。
    2. for循环的变量在小括号顶一，只有循环内部才能用;
    而其余两个变量提前定义，可以往后再使用。

## 2.5.1 循环控制
    Break用法：
    1. switch语句中，或者循环语句中打断循环。
    2. 循环语句中，一旦执行，，打断循环。
    建议：
    次数确定用for，不确定用while
    
    Continue用法:
    一旦执行，跳过当次循环，马上开始下一循环。（demo10）

## 2.5.2 死循环 (demo11)
    标准格式:
    while (true) {
    循环体
    }
    __
## 2.5.3 嵌套循环 (demo12)
    格式:
    for(初始化；循环条件；步进）{
        for(初始化；循环条件；步进) {
        执行语句;
        }
    }

</details>

[第三章代码链接](https://github.com/Yujunliu95/RE0_JAVA/tree/master/src)

<details>
<summary>第三章-IDEA开发</summary>

## Demo01:打印矩形
    定义格式:
    public static void 方法名称() {
    方法体 
    }
    
    注意：定义顺序无所谓，定义必须挨着；
    
##  Demo02:方法定义
    格式:
    修饰符 返回值类型 方法名称 (参数类型 参数名,....){
    方法体
    return 返回值;
    }
    
    修饰符: public static
    返回值类型: 最终产生的数据结果是什么类型
    方法名称: 方法的名字，规则和变量一样，小驼峰
    参数类型: 进入方法的数据是什么类型
    参数名称: 进入方法的数据对应的变量名称
    ps: 参数如果有多个，使用逗号进行分隔
    方法体: 若干行代码
    return: 1.停止当前方法，将后面的返回值还给调用数
    返回值: 方法执行后最终产生的结果
    
    return后面的返回值，必须和方法名称前面的"返回值类型" 对应
    
##  Demo02: 方法的调用/流程
    1. 单独调用：方法名称（参数）
    2. 打印调用: System.out.println
    3. 赋值调用

## Demo03: 方法参数
    有参数： 小括号中有内容，当一个方法需要数据条件才
    能完成任务的时候；
    无参数： 小括号留空
    
## Demo04: 对比有无返回值
   注意: 对于有返回值可以使用单独调用、打印、或者赋值
   对于无返回值，只能使用单独调用
   
## 练习题 Practice01- 比较两个数字
    三要素：
    返回值类型：boolean
    方法名称： isSame
    参数列表： int a, int b
## 练习题 Practice02: 1-100所有和

## 练习题 Practice03: 打印指定次数的helloworld
    返回值类型：打印操作
    方法名称：printCount
    参数列表：打印次数int
    
## 练习总结：
    1. 方法应该定义在类当中，但是不能在方法当中再定义类
    2. 方法定义前后顺序无所谓
    3. 方法定义后不会执行
    4. 如果方法有返回值，那么必须写上 return 返回值
    5. void没有返回值，不能写return后面的返回值，只能return自己
    6. 一个方法可以多个return，但是要保证只有一个会被执行到。
    
## Demo05 方法重载（overload）
    1.多个方法的名称一样，但是参数列表不一样。
    相关：
    参数多类型数据不同，
    参数类型不同，
    参数的个数不同。
    无关：
    1. 与参数的名称无关
    2. 与方法的返回值类型无关
    
## Practice 04 重载练习题1 - 
    判断2数据是否一样，比如2个byte，short，int，long
    
## Practice 05 判断题：
    1. public static void open() {} - 正确重载
    2. public static void open(int a) {} - 正确
    3. static void open (int a, int b) {} - 与第八行冲突
    4. public static void open (double a, int b) {} -正确
    5. public static void open (int a, double b) {} - 与第六冲突   
    6. public void open (int i, double d) {} - 与第五行冲突
    7. public static void OPEN() {} -代码正确，但不是有效重载
    8. public static void open (int i, int j) {} - 与第三行冲突 
    
    
## Practice 06 模拟println方法
    调用输出语句，println进行了多种数据类型的重载
    
## Demo05 数组的概念 Array
    数组：可以保存多个数据，是一种容器。
    特点：
    1. 数组是一种引用类型
    2. 数组当中多个数据，类型必须统一
    3. 数组长度在运行期间，不可改变
    
    初始化方式：
    1.动态初始化 （指定长度）
    2.静态初始化 （指定内容）
    
    动态初始化格式: 数据类型[] 数组名称 = new 数据类型[数组长度];
    静态初始化格式: 数据类型[] 数组名称 = new 数据类型[]  {元素1，元素2，...};

    省略静态格式: 数据类型[] 数组名称 = {元素1，元素2，...};
    
    注意事项：
    1.静态初始化没有直接指定长度，但是会自动推算出长度
    2.静态/动态初始化的标准格式，可以拆分成2个步骤：
    数据类型[] 数组名称；
    数组名称 = new 数据类型[数组长度];

## Demo06 访问数组
    1. 直接打印得到内存地址hash值：I@ 50cbc42f 
    I代表int 后面为16进制
    访问格式：数组名称[intex值] （跟python一样）
 
## Demo07 访问数组-continue
    动态初始化元素默认值：
    整数: 0
    浮点: 0.0
    字符: \u0000
    boolean: false
    引用类型: null 
    静态初始化也有默认值，但程序会马上将默认值替换
    
## Java中内存划分
    1.栈(stack): 存放的是方法中的局部变量，方法运行一定在栈中运行
    局部变量: 方法的参数，或者是方法{}内部的变量
    作用域: 一旦超出作用域，立刻从栈内存当中消失

    2.堆(Heap): new出来的都在堆当中
    地址值: 16进制
    堆内存里面的数据都有默认值，规则上面讲了。

    3.方法区(Method Area): 存储.class相关信息，包含方法的信息。
    
    4.本地方法栈( Native method stack): 与操作系统相关
    5.寄存器（PC Register):与CPU相关
    
## Demo08 一个数组的内存图
   [![JngQKJ.png](https://s1.ax1x.com/2020/04/18/JngQKJ.png)](https://imgchr.com/i/JngQKJ)

## 两个数组的内存图
   [![Jnglr9.png](https://s1.ax1x.com/2020/04/18/Jnglr9.png)](https://imgchr.com/i/Jnglr9)

## Demo09 两个引用指向同一个
    int[] arrayB = arrayA
    将arrayA的地址赋值给arrayB
   [![Jngu2F.png](https://s1.ax1x.com/2020/04/18/Jngu2F.png)](https://imgchr.com/i/Jngu2F)
   
## Demo10 常见问题
    1. 数组索引越界异常
    2. 空指针异常
    
## 获取数组长度： 数组名称.length
   ![Jngu2F.png](https://s1.ax1x.com/2020/04/18/Jngu2F.png)
   
## Practice07 - 遍历数组

## Practice08 - 求出数组最值

## Practice09 - 数组元素反转 
    不创建新的array，对称位置元素交换
    [1,2,3,4] ---> [4,3,2,1]
    
## Demo11 - 数组作为方法的参数
    数组可以作为方法参数
    调用的时候，向方法括号传递参数，传递进去的是地址值
    
## Demo12 - 数组作为方法的返回 return
    任何数组作为方法的参数，传递进去的是数组的地址值。
    数组作为方法的返回值，返回的也是数组的地址值。



    
</details>

[第四章代码链接](https://github.com/Yujunliu95/RE0_JAVA/tree/master/src/chapter04)

<details>
<summary>第四章-面向对象</summary>

## Object01 面向对象，面向过程
    面向过程：需要实现功能的时候，每一个细节都要处理
    面向对象：需要实现功能的时候，不关心具体步骤
    面向对象举例： 封装，继承，多态
    
## 类和对象
    类： 一个事物的属性和行为，是对象的模板（抽象）
    对象：对象是类的一个实例 （具体）

## Student 类的定义
    public class Student.
    定义类（属性）：姓名，年龄。  行为（成员方法）：吃饭睡觉学习
    成员变量: String name   int age
    成员方法: public void eat() {} 吃饭 。 没有static关键字
    注意：
    1.成员变量在main外，class当中
    2.没有static关键字
    
## Object02 对象的创建以及引用
    通常类不能直接使用，根据类创建对象才能使用
    1. 调包： 
    import 包名称.类名称
    对于和当前类属于同一个包，可以省略
    2. 创建:
    类名称 对象名 = new 类名称()
    studnet stu = new student();  
    3. 使用:
    使用成员变量: 对象名.成员变量名
    使用成员方法: 对象名.成员方法名(参数）
    (也就是，想用谁就点谁)

## Phone 手机类练习-一个对象的内存图 PracticePhone

[![JGLCNj.png](https://s1.ax1x.com/2020/04/21/JGLCNj.png)](https://imgchr.com/i/JGLCNj)\

## 两个引用指向同一个对象-内存图 PracticePhone

[![Ja41bD.png](https://s1.ax1x.com/2020/04/23/Ja41bD.png)](https://imgchr.com/i/Ja41bD)


## 使用对象类型作为方法的参 Object03
[![JaImX6.png](https://s1.ax1x.com/2020/04/23/JaImX6.png)](https://imgchr.com/i/JaImX6)


## 使用对象类型作为方法的返回值 Object04
[![JaohsP.png](https://s1.ax1x.com/2020/04/23/JaohsP.png)](https://imgchr.com/i/JaohsP)

## 成员变量和局部变量的区别 object05
    1.定义的位置不一样
    局部变量: 在方法的内部.
    成员变量: 在方法的外部，直接写在类当中
    
    2.作用范围不一样
    局部变量: 只有方法当中才可以使用，出了方法就不能用
    成员变量: 整个类都可以通用

    3.默认值不一样
    局部变量: 没有默认值，需要赋值
    成员变量: 有默认值
    
    4.内存位置也不一样
    局部变量: 位于栈内存
    成员变量：位于堆内存
    
    5. 生命周期不一样
    局部变量：方法进栈诞生，出栈小时
    成员变量：创建时诞生，垃圾回收时消失（无法控制）
    
    
## 三大特征之一-------封装性 object06
    1. 方法是一种封装
    2. 关键字private也是一种封装
    
## Private关键字的作用及使用 Person
    用private进行变量修饰与限制
    一旦使用private，本类当中可以随意访问，如果超出范围，则不能访问
    间接访问：get/set方法
    
## Private练习 Student
    boolean --------> setMale, isMale 

## This关键字的作用
    






</details>