Write a program which keeps the information about companies and their employees.

You will receive company names and an employees' id until you receive the "End" command. Add each employee to the given company. Keep in mind that a company cannot have two employees with the same id.

Print the company name and each employee's id in the following format:

"{company_name}

-- {id1}

-- {id2}

…

-- {idN}"




Input / Constraints

· Until you receive "End", the input come in the format: "{companyName} -> {employeeId}".

· The input always will be valid.



Example:



Input:



SoftUni -> AA12345

SoftUni -> BB12345

Microsoft -> CC12345

HP -> BB12345

End




Output:



SoftUni 
-- AA12345 
-- BB12345 
Microsoft 
-- CC12345 
HP 
-- BB12345



