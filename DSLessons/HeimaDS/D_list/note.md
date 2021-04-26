# 线性表（List）



#### 线性表概念

线性表是最基本、最简单、也是最常用的一种数据结构。一个线性表是n个具有相同特性的数据元素的有限序列。



#### 线性表的特征

数据元素之间具有一种“一对一”的逻辑关系。

- 线性表的第一个数据元素没有前驱元素，该元素被称为头结点。
- 线性表的最后一个数据元素没有后继，这个数据元素被称为尾结点。
- 除了第一个和最后一个数据元素之外，其他数据元素有且仅有一个前驱元素和一个后继元素。

> 前驱元素：若A元素在B元素的前面，则称A为B的前驱元素。
>
> 后继元素：若B元素在A元素的后面，则称B为A的后继元素。



#### 线性表的分类

线性表中数据存储的方式可以是顺序存储，也可以是链式存储。

按照数据的存储方式不同，可以把线性表分为顺序表和链表





## 顺序表（SequenceList）



#### 顺序表概念

顺序表是在计算机内存中以数组的形式保存的线性表。线性表的顺序存储是指用一组地址连续的存储单元，依次存储线性表中的各个元素。该特性使得线性表中在逻辑结构上相邻的数据元素存储在相邻的物理存储单元中，以此反映了数据元素在逻辑上的相邻关系。



#### 顺序表实现API

| 类名     | SequenceList\<T\>                                            |
| -------- | ------------------------------------------------------------ |
| 构造方法 | SequenceList(int capacity)：创建容量为capacity的SequenceList对象 |
| 成员变量 | 1. public void clear()：清空线性表内容<br />2. public boolean isEmpty()：判断线性表是否为空<br />3. public int length()：获取线性表中元素的个数<br />4. public T get(int i)：读取并返回线性表中的第i个元素的值<br />5. public void insert(int i, T t)：在线性表的第i个元素之前插入一个值为t的数据元素<br />6. public void insert(T t)：向线性表中添加一个元素<br />7. public T remove(int i)：删除并返回线性表中第i个数据元素<br />8. public int indexOf(T t)：返回线性表中首次出现的指定的数据元素的位序号，不存在则返回-1 |
| 成员方法 | 1. private T[] elements：存储元素的数据<br />2. private int N：当前线性表的长度 |



#### 顺序表的遍历

在Java中，遍历集合的方式一般是使用foreach循环。

支持foreach循环所需要的步骤：

1. 需要类实现Iterable接口，重写iterator方法；
2. 在类内部提供一个内部类Iterator，实现iterator接口，重写hasNext方法和next方法；

```
例子：详见SequenceList实现
```



#### 顺序表的扩容

容器在设计时，要考虑其容量的伸缩性。对于顺序表的扩容，其实就是对其内部维护的数组大小进行改变。

需要改变顺序表容量的时机：

- 添加元素时，元素大于容量，扩容一倍；
- 移除元素时，元素小于容量的1/4，缩容一半；



#### 顺序表的时间复杂度

获取元素时，不论数据元素量多大，直接通过元素的下标就可以访问对应元素，所以时间复杂度为`O(1)`；

添加/删除元素时，必须将目标位置后面的元素都进行一次移动，随着数量增大，移动元素线性增长，所以时间复杂度为`O(n)`；

当涉及到容器扩容时，需要申请新的内存，并复制元素，导致耗时会增加。当元素越多时，耗时增加就越明显。所以插入/删除元素的时间复杂度不是线性的。



#### Java中的顺序表实现

ArrayList类是Java集合框架中最常用的顺序表，底层使用数组实现，同样提供了增删改查、扩容、遍历等功能。

ArrayList常用方法：==待补充==

| 方法 | 作用 |
| :--- | ---- |
|      |      |
|      |      |
|      |      |
|      |      |
|      |      |
|      |      |
|      |      |
|      |      |
|      |      |





## 链表（LinkedList）



#### 链表概念

顺序表的查询很快，增删的效率比较低，原因在于其通过数组来保存数据。而链表是一种物理存储单元上非连续、非顺序的存储结构。其数据元素的逻辑顺序是通过链表中的指针链接次序体现的。链表由一系列的结点组成，结点可以在运行时动态生成





#### 单向链表

##### 概念

单向链表是链表的一种，它由多个结点组成，每个结点都由一个数据域和一个指针域组成，数据域用来存储数据，指针域用来指向其他后继结点。链表的头结点的数据域不存储数据，指针域指向第一个真正存储数据的结点。

##### 结点类API设计

| 类名     | Node\<T\>                                       |
| -------- | ----------------------------------------------- |
| 构造方法 | Node(T t, Node next)：构建Node对象              |
| 成员变量 | T item：存储元素<br />Node next：指向下一个结点 |

```java
private class Node<T> {

    public T item;
    public Node<T> next;

    public Node(T item, Node<T> next) {
        this.item = item;
        this.next = next;
    }

}
```

##### API设计

| 类名       | LinkList\<T\>                                                |
| ---------- | ------------------------------------------------------------ |
| 构造方法   | LinkList()：创建LinkList对象                                 |
| 成员变量   | 1. public void clear()：清空线性表内容<br />2. public boolean isEmpty()：判断线性表是否为空<br />3. public int length()：获取线性表中元素的个数<br />4. public T get(int i)：读取并返回线性表中的第i个元素的值<br />5. public void insert(int i, T t)：在线性表的第i个元素之前插入一个值为t的数据元素<br />6. public void insert(T t)：向线性表中添加一个元素<br />7. public T remove(int i)：删除并返回线性表中第i个数据元素<br />8. public int indexOf(T t)：返回线性表中首次出现的指定的数据元素的位序号，不存在则返回-1 |
| 成员内部类 | private class Node\<T\>：结点类                              |
| 成员方法   | 1. private Node head：记录首结点<br />2. private int N：记录链表的长度 |





#### 双向链表

##### 概念

双向链表是链表的一种，它由多个结点组成，每个结点都由一个数据域和两个指针域组成，数据域用来存储数据，其中一个指针域用来指向后继结点，另一个指针域用来指向前驱结点。链表的头结点的数据域不存储数据，指向前驱结点的指针域值为null，指向后继结点的指针域指向第一个真正存储数据的结点。链表的尾结点的数据域不存储数据，指向后继结点的指针域值为null，指向前驱结点的指针域指向最后一个真正存储数据的结点。

##### 结点类API设计

| 类名     | Node\<T\>                                                    |
| -------- | ------------------------------------------------------------ |
| 构造方法 | Node(T t, Node pre, Node next)：构建Node对象                 |
| 成员变量 | T item：存储元素<br />Node next：指向下一个结点<br />Node pre：指向上一个结点 |

##### API设计

| 类名       | TwoWayLinkList\<T\>                                          |
| ---------- | :----------------------------------------------------------- |
| 构造方法   | TwoWayLinkList()：创建LinkList对象                           |
| 成员变量   | 1. public void clear()：清空线性表内容<br />2. public boolean isEmpty()：判断线性表是否为空<br />3. public int length()：获取线性表中元素的个数<br />4. public T get(int i)：读取并返回线性表中的第i个元素的值<br />5. public void insert(int i, T t)：在线性表的第i个元素之前插入一个值为t的数据元素<br />6. public void insert(T t)：向线性表中添加一个元素<br />7. public T remove(int i)：删除并返回线性表中第i个数据元素<br />8. public int indexOf(T t)：返回线性表中首次出现的指定的数据元素的位序号，不存在则返回-1<br />9. public T getFirst()：获取第一个元素<br />10. public T getLast()：获取最后一个元素 |
| 成员内部类 | private class Node\<T\>：结点类                              |
| 成员方法   | 1. private Node head：记录首结点<br />2. private Node last：记录尾结点<br />3. private int N：记录链表的长度 |



#### Java中的链表实现

LinkedList类是Java集合框架中最常用的链表表，底层使用双向链表实现，同样提供了增删改查、扩容、遍历等功能。

LinkedList常用方法：==待补充==

| 方法 | 作用 |
| :--- | ---- |
|      |      |
|      |      |
|      |      |
|      |      |
|      |      |
|      |      |
|      |      |
|      |      |
|      |      |



#### 链表的时间复杂度

对于链表而言，获取/插入/删除元素都需要遍历链表找到对应元素，所以时间复杂度为`O(n)`。

相比较顺序表，链表插入和删除的时间复杂度虽然一样，但仍然有很大的优势，因为链表的物理地址是不连续的，它不需要预先制定存储空间大小，或者在存储过程中涉及到扩容等操作，同时它并没有涉及元素的交换。

总的来说，相较于顺序表，链表的查询操作性能会比较低，但增删操作性能优于顺序表。因此，如果程序中查询操作比较多，建议使用顺序表，增删操作比较多，建议使用链表。



#### 链表反转

```java
// 单链表反转
public void reverse() {
    if (!isEmpty()) {
        reverseNode(this.head.next);
    }
}

// 反转单个结点
private Node reverseNode(Node current) {
    if (current.next == null) {
        // 递归基
        this.head.next = current; // 将头结点指向尾部
        return current; // 返回当前结点
    } else {
        Node previous = reverseNode(current.next); // 将后序结点反转，并得到反转后的最后一个元素
        previous.next = current; // 将最后一个元素的下一个设置为现有结点
        current.next = null; // 将当前最后元素的下一个设置为空
        return current; // 返回当前结点
    }
}
```

> 递归的核心在于关联父问题和子问题，在处理父问题时，要假设子问题已经得到了解决，利用子问题的结果，借此得到父问题的结果。
>
> 链表反转代码中，reverseNode返回参数存在的意义就在于为父问题提供子问题的解决结果。
>
> 如果在递归过程中，不去执行设置当前最后元素的下一个为空
>
> ```java
> current.next = null;
> ```
>
> 则会出现最后一个元素又指向了前一个元素，即循环引用的产生。



#### 快慢指针

##### 1. 中间值问题

需求：获取链表中间值。

思路：通过快慢指针，慢指针每次前进一格，快指针每次前进两格，当快指针指向链表尾时，慢指针刚好在链表的中间位置。

```java
private static int getMid(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow.item;
}
```

##### 2. 判断链表是否有环

需求：判断链表中是否存在环

思路：通过快慢指针，慢指针每次前进一格，快指针每次前进两格，如果慢指针和快指针在某一时刻，指向了同一节点，说明该链表存在环，否则则无环。

```java
public static boolean isCircle(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
    	slow = slow.next;
        fast = fast.next.next;
    	if (slow == fast) {
    		return true;
    	}
    }
    return false;
}
```

##### 3.有环链表中环入口位置

需求：获取一个有环链表中，环的入口结点的位置

思路：当快慢指针相遇时，可判断链表中存在环，这时重新设定一个新指针指向链表的起点，步长为1，则慢指针与新指针相遇的地方就是环的入口。

```java
public static Node getEntrance(Node head) {
    Node slow = head;
    Node fast = head;
    while (true) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            break;
        }
    }
    Node temp = head;
    while (true) {
        slow = slow.next;
        temp = temp.next;
        if (slow == temp) {
            return temp;
        }
    }
}
```

> 证明慢指针和新指针相遇的地方即为环入口：
>
> 设链表中不在环的部分长度为a，在环的部分中，慢指针和快指针相遇的位置到入口的距离为b和c。由于慢指针在入环时，快指针在环内“落后”不到一圈的距离，而每次移动，都能缩短一格，所以慢指针必在一圈走完前相遇快指针，假设此时快指针已走完了k次整个环，则以下的等式成立：
> $$
> 2(a+b)=a+b+k(b+c)
> $$
> 化简可得，
> $$
> a=(k-1)(b+c)+c
> $$
> 该式子的含义为，a等于c加上数个环的长度，所以，新指针和慢指针会在入口处相遇。



#### 循环链表

##### 概念

链表整体为圆环状，在单向链表中，最后一个节点的指针为null，不指向任何结点，而在循环链表中，只需要让单向链表的最后一个节点的指针指向头结点即可。

##### 约瑟夫问题

问题描述：据说著名犹太历史学家Josephus有过以下的故事：在罗马人占领乔塔帕特后，39 个犹太人与Josephus及他的朋友躲到一个洞中，39个犹太人决定宁愿死也不要被敌人抓到，于是决定了一个自杀方式，41个人排成一个圆圈，由第1个人开始报数，每报数到第3人该人就必须自杀，然后再由下一个重新报数，直到所有人都自杀身亡为止。然而Josephus 和他的朋友并不想遵从。首先从一个人开始，越过k-2个人（因为第一个人已经被越过），并杀掉第*k*个人。接着，再越过k-1个人，并杀掉第*k*个人。这个过程沿着圆圈一直进行，直到最终只剩下一个人留下，这个人就可以继续活着。问题是，给定了和，一开始要站在什么地方才能避免被处决。Josephus要他的朋友先假装遵从，他将朋友与自己安排在第16个与第31个位置，于是逃过了这场死亡游戏。

思路：创建环形链表，遍历该链表，移除相应结点，直到链表中无结点。





## 栈



#### 栈的概念

栈是一种基于先进后出（FILO）的数据结构，是一种只能在一端进行插入和删除操作的特殊线性表。它按照先进后出的原则存储数据，先进入的数据被压入栈底，最后加入的数据再栈顶，需要读数据时，则从栈顶开始弹出数据。



#### 栈实现

##### 栈API设计

| 类名       | Stack\<T\>                                                   |
| ---------- | :----------------------------------------------------------- |
| 构造方法   | Stack()：创建Stack对象                                       |
| 成员方法   | 1. public boolean isEmpty()：判断栈是否为空<br />2. public int size()：获取栈中元素的个数<br />3. public T pop()：弹出栈顶元素<br />4. public void push(T t)：向栈中压入元素t |
| 成员内部类 | private class Node\<T\>：结点类                              |
| 成员变量   | 1. private Node head：记录首结点<br />2. private int N：记录栈保存元素个数 |



#### 栈应用

##### 括号匹配问题

需求：判断一个字符串是否有成对匹配的"("和")"

思路：利用栈的特性。遍历字符串，在遇到"("时，压入栈，在遇到")"时，判断栈是否为空，如果为空，则说明不匹配，如果非空，则将"("弹出栈，遍历结束后，判断栈是否为空，如果非空，说明剩余"("没匹配，如果为空，则说明已匹配完。

```java
public static boolean isMatch(String line) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < line.length(); i++) {
        char c = line.charAt(i);
        if (c == '(') {
            stack.push(c);
        } else if (c == ')') {
            Character temp = stack.pop();
            if (temp == null) {
                return false;
            }
        }
    }
    return stack.isEmpty();
}
```

##### 逆波兰表达式求值问题

需求：逆波兰表达式，又称为后缀表达式，该表达式中运算符总是放在跟它相关的操作数之后。而中缀表达式中， 二元运算符总是置于两个操作数之间，但对于计算机而言，中缀表达式不具有规律性，难以解析。

思路：利用栈保存操作数。遍历表达式，在遇到操作数时，直接压入栈中，在遇到操作符时，将栈顶的两个元素取出，按照运算符运算的规则运算出结果，并重新压入栈中。在遍历完字符串后，栈中应剩下唯一一个操作数，即是最后的计算结果

```java
public static int calculate(String[] notation) {
    Stack<String> stack = new Stack<>();
    for (String s : notation) {
        switch (s) {
            case "+": {
                int latter = Integer.parseInt(stack.pop());
                int former = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(former + latter));
                break;
            }
            case "-": {
                int latter = Integer.parseInt(stack.pop());
                int former = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(former - latter));
                break;
            }
            case "*": {
                int latter = Integer.parseInt(stack.pop());
                int former = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(former * latter));
                break;
            }
            case "/": {
                int latter = Integer.parseInt(stack.pop());
                int former = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(former / latter));
                break;
            }
            default:
                stack.push(s);
                break;
        }
    }
    return Integer.parseInt(stack.pop());
}
```





## 队列



#### 队列的概念

队列是一种基于先进先出（FIFO）的数据结构，是一种只能在一端进行插入，在另一端进行删除操作的特殊线性表。它按照先进先出的原则，先进入的数据，先出队列。



#### 队列实现

##### 队列API设计

| 类名       | Queue\<T\>                                                   |
| ---------- | :----------------------------------------------------------- |
| 构造方法   | Queue()：创建Queue对象                                       |
| 成员方法   | 1. public boolean isEmpty()：判断队列是否为空<br />2. public int size()：获取队列中元素的个数<br />3. public T dequeue()：从队列中拿出一个元素<br />4. public void enqueue(T t)：往队列中插入一个元素 |
| 成员内部类 | private class Node\<T\>：结点类                              |
| 成员变量   | 1. private Node head：记录首结点<br />2. private Node last: 记录尾结点<br />3. private int N：记录队列中的元素个数 |





## 符号表



#### 符号表的概念

符号表最主要的目的就是将一个键和一个值关联起来，其内部保存的是键值对。

在符号表中，每个键具有唯一性。



#### 符号表实现

##### 结点类API设计

| 类名     | Node\<T\>                                                    |
| -------- | ------------------------------------------------------------ |
| 构造方法 | Node(Key key, Value value, Node next)：构建Node对象          |
| 成员变量 | 1. public Key key：存储键<br />2. public Value value：存储值<br />3. public Node next：存储下一个结点 |

##### API设计

| 类名       | SymbolTable\<Key, Value\>                                    |
| ---------- | ------------------------------------------------------------ |
| 构造方法   | SymbolTable()：创建SymbolTable对象                           |
| 成员变量   | 1. public Value get(Key key)：根据键key，找对应的值<br />2. public void put(Key key, Value value)：向符号表中插入一个键值对<br />3. public void delete(Key key)：删除键为key的键值对<br />4. public int size()：获取符号表的大小<br /> |
| 成员内部类 | private class Node\<T\>：结点类                              |
| 成员方法   | 1. private Node head：记录首结点<br />2. private int N：记录链表的长度 |



