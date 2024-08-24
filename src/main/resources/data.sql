CREATE TABLE suppliers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    company_name VARCHAR(255),
    website VARCHAR(255),
    location VARCHAR(255),
    nature_of_business VARCHAR(255),
    manufacturing_processes VARCHAR(255)
);


INSERT INTO suppliers (company_name, website, location, nature_of_business, manufacturing_processes)
VALUES ('Company A', 'http://companya.com', 'India', 'small_scale', '3d_printing');
