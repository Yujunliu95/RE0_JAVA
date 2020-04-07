# 此仓库将记录本菜鸡从0开始学习JAVA的所有过程
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

## 1.6.3 符合运算符
    1. +=    a += 1 相当于 a = a + 1
    2. -=    b -= 4 相当于 b = b - 4
    3. *=    c = c * 
    4. /=    d = d / 6
    5. %=    e = e % 7
    注意：只限变量，常量不行
    
    
    
    
    
</details>