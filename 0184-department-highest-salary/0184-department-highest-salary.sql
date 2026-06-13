SELECT Department.name AS Department , Employee.name AS Employee , Salary
FROM Employee 
LEFT JOIN Department
ON Employee.departmentID = Department.id
WHERE(DepartmentID, salary) IN 
(SELECT DepartmentId , MAX(Salary) FROM Employee
GROUP BY DepartmentID)