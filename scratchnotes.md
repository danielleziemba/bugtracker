## Repository vs Service Layers

* business logic should be in the service layer
* database (storage) should be in the repository layer

### Example
You have to save an entity(Person). But before saving the Person you want to make sure that the Person's username does not exist already. So the validation part should go to the business layer.

Service:

```
Person Repository repository;
public Person save(Person p) {
    Person p = findByName(p.getName());
    if (p != null) {
        return customException();
    }
    return repository.save(p);
}

public Person findByName(String name) {
    return repository.findByName(name);
}
```

Repository: 
```
Person findByUsername(String username);
```

* You could have done this all in Repository Layer itself. Assume you have implemented this in your Repository then your save method always check before saving (sometimes you may not be required to do so).

---
First of all, every design pattern is made to solve a common problem in software development. If you are sure that you won't face those problems in your specific use case, you don't need to follow these patterns.

1. You can call repositories directly from your controller or wherever you need it. Repositories should perform basic database operations and there's no problem in calling them if that's all you need.

2. But most of the time, you want some business logic to be performed before/after working with the database. That's where Service classes get involved (one of the SOLID principles is the Single Responsibility Principle - you should not have both persistence operations and business logic in the same class). For example, you call your EmployeeService.save() method to save an employee, and that method executes business logic (for example, checks that the employee's ID number is correct) and then calls the repository class (which only saves the employee in the database).

3. The interface and implementation pattern is an extension of this last one. Having an interface makes your application easier to maintain in the future if new functionalities are needed. Ideally, most of your application will call the interface, and the appropriate implementation will be provided (for example, by injection in Spring components). For example, if a year from now you need a special implementation that performs different business logic, you can just implement that interface and inject the bean as needed.

That's why most developers future-proof their applications by using the repository-interface-implementation structure. If you are sure that you'll only need basic CRUD operations, there's no need to create Services.

