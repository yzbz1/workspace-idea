package cn.itcast.day09.demo05;
/*
方法覆盖重写的注意事项:
1.必须保证父子类方法名以及参数相同
@Override:写在重写的方法前面用来检测改方法是否构成重写,
这个注解不写,只要满足要求,也是正确重写 @Override只是用来检测的
2.子类方法的返回值必须【小于等于】父类方法的返回值范围
object类是所有类的公共最高父类
3.子类方法的权限大于等于父类方法的修饰符
public > protected > (default) > private
(default) 为留空
*/



public class Demo01Override {
}
