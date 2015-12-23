package dynamicprroxy;

import java.lang.reflect.InvocationHandler;  
import java.lang.reflect.Method;  
import java.lang.reflect.Proxy;  
 
//����������,���ﲻ����abstract�����࣬һ��Ҫ��interface  
interface AbstractSubject {  
    public abstract void request();  
}  
 
// ��ʵ�����࣬����������  
class RealSubject implements AbstractSubject {  
    public void request() {  
        System.out.println("RealSubject's request() ...");  
    }  
}  
 
// ��̬�����࣬ʵ��InvocationHandler�ӿ�  
class DynamicProxy implements InvocationHandler {  
 
    // ���������ʵ��  
    Object obj = null;  
    
    // ���������ߵ�ʵ��������̬������Ĺ��캯����  
    public DynamicProxy(Object obj) {  
        this.obj = obj;  
    }  
 
    /**  
     * ����InvocationHandler�ӿ��е�invoke()����  
     *   
     * ����Ҫ���ǣ���̬����ģʽ����ʹ�������ڲ��ı�ԭ�����еĴ���ṹ  
     * ������£���ԭ���ġ���ʵ������������չ����ǿ�书�ܣ����ҿ��Դﵽ  
     * ���Ʊ�����������Ϊ�������before��after�������ǿ��Խ�������  
     * �����������չ���ˡ�  
     */ 
    public Object invoke(Object proxy, Method method, Object[] args)  
            throws Throwable {  
        /*  
         * before ��doSomething();  
         */ 
        Object result = method.invoke(this.obj, args);  
         
        /*  
         * after : doSomething();  
         */ 
        return result;  
    }  
}  
 
// ������  
public class test {  
    public static void main(String[] args) {  
 
        // ���������ʵ��  
        AbstractSubject realSubject = new RealSubject();  
 
        // ��ñ�����������������ʹ��JVM�ܹ����ز��ҵ�����������ڲ��ṹ���Լ���ʵ�ֵ�interface  
        ClassLoader loader = realSubject.getClass().getClassLoader();  
 
        // ��ñ���������ʵ�ֵ����нӿ�interface,ʹ�ö�̬�������ʵ��  
        Class<?>[] interfaces = realSubject.getClass().getInterfaces();  
 
        // �ñ��������ʵ��������̬�������ʵ���������������ô������  
        InvocationHandler handler = new DynamicProxy(realSubject);  
 
        /*  
         * loader : ����������������  
         * interfaces ������������ʵ�ֵ����нӿڣ�����Щ�Ƕ�̬������Ҫʵ�ֵĽӿ��б�  
         * handler �� �ñ��������ʵ��������̬�������ʵ���������������ô������  
         *   
         * return ������ʵ���˱���������ʵ�ֵ����нӿڵ�Object���󣬼���̬������Ҫǿ��ת��  
         */ 
        //��ô����ʵ��  
        AbstractSubject proxy = (AbstractSubject) Proxy.newProxyInstance(  
                loader, interfaces, handler);  
 
        proxy.request();  
        //��ӡ���ô���ʵ��������  
        System.out.println(proxy.getClass().getName());  
    }  
} 
