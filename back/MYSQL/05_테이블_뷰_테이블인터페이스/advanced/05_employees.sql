use employees;

create view EMPLOYEES_INFO as
select
    e.emp_no,
    e.birth_date,
    e.first_name,
    e.last_name,
    e.gender,
    e.hire_date,
    t.title,
    t.from_date as t_from,
    t.to_date as t_to,
    s.salary,
    s.from_date as s_from,
    s.to_date as s_to
from employees e
    join titles t on e.emp_no = t.emp_no
    join salaries s on e.emp_no = s.emp_no;

select *
from EMPLOYEES_INFO
where t_to = '9999-01-01';

create view EMP_DEPT_INFO as
select
    dept.emp_no,
    dept.dept_no,
    d.dept_name,
    dept.from_date,
    dept.to_date
from dept_emp dept
    join departments d on dept.dept_no = d.dept_no;

select *
from emp_dept_info
where to_date = '9999-01-01';