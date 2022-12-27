# java8-method-refereance

Note: while calling instance method with having no-argument that method is bydefault consider as static method.

example:: 
//   for instance method
        List<String> names = EmployeeDao.getEmployees()
                .stream()
                .map(Employee::getName)// whenever we call a instance method from object it if method does't
                                        // have paramether than it consider as static method
                .collect(Collectors.toList());
