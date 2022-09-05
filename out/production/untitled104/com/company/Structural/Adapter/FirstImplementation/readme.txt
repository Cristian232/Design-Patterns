


                    Adapter Design pattern

        Definition:
            Using Adapter pattern we make existing object work with cx, by adapting to cx expected interface
            Also called wrapper as it wraps existing object

        Use:
            Existing object that provides the func cx needs, but cx code expects a obj with a diff interface

        Example: How_to

            Step 1: Create a Class for Adapter
            Step 2: Adapter must implement interface expected by the client
            Step 3: In Class Adapter implementation, we are going to forward a method inherited from adaptee
            Step 4: In Object Adapter, we are going to implement the target interface and accept adaptee as constructor arg


        In main:

              private static void populateEmployeeData(Employee employee){
                        employee.setFullName("Elliot Alderson");
                        employee.setJobTitle("Security Engineer");
                        employee.setOfficeLocation("Allsafe CyberSecurity, New York");
                }

                 // Using a Class/Two-Way adapter
                      EmployeeClassAdapter adapter = new EmployeeClassAdapter();
                      populateEmployeeData(adapter);
                      BusinessCardDesigner designer = new BusinessCardDesigner();
                      String card = designer.designCard(adapter);
                      System.out.println(card);

                      // Using Object Adapter
                      Employee employee = new Employee();
                      populateEmployeeData(employee);
                      EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
                      card = designer.designCard(employeeObjectAdapter);
                      System.out.println(card);
