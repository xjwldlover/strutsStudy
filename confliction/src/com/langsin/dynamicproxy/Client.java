package com.langsin.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//�ͻ���

public class Client
{
	static public void main(String[] args) throws Throwable
	{

		RealSubject rs = new RealSubject(); // ������ָ����������
		InvocationHandler ds = new DynamicSubject(rs);
		Class<?> cls = rs.getClass();

		// ������һ�������ɴ���

		Subject subject = (Subject) Proxy.newProxyInstance(
				cls.getClassLoader(), cls.getInterfaces(), ds);

		subject.request();
	}
}