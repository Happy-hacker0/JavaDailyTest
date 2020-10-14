package test1014;

/**
 * @author James Gosling
 * @date 2020/10/14 19:16
 */
public class Native {
    public static void main(String[] args) {
        System.out.println(new Object().hashCode());
        //hashCode方法使用native修饰 native修饰的方法没有方法体 表示原生的 本地的
        //native关键字只能修饰方法 方法不是使用Java实现的 使用的是底层的C/C++
    }
}
