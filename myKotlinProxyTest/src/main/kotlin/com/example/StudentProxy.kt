package com.example

/***
 * 通过关键字 by 完成委托
 * StudentProxy 无需实现 Person 的 speak()
 */
class StudentProxy(p: Person) : Person by p {

}