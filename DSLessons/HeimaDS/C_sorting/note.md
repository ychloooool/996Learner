# 排序（Sorting）





### Comparable接口介绍

在写排序算法的过程中，一定会涉及到各个元素之间的比较，而Java提供了一个接口`Comparable`用于定义排序规则

> ```java
> public class Student implements Comparable<Student> {
> 
> 	private String name;
> 	private int age;
> 
>  	@Override
> 	public int compareTo(Student that) {
> 		return this.age - that.age;
> 	}
>      
> }
> ```
>
> 创建了Student类，并定义了两个Student对象比较的规则，即通过两个对象的age成员来比较大小。















