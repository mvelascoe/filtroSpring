INSERT INTO country (namecountry) VALUES ('España');
INSERT INTO country (namecountry) VALUES ('Argentina');
INSERT INTO country (namecountry) VALUES ('Alemania');

INSERT INTO region (namereg, codecountry) VALUES ('Region 1', 1);
INSERT INTO region (namereg, codecountry) VALUES ('Region 2', 2);
INSERT INTO region (namereg, codecountry) VALUES ('Region 3', 3);

INSERT INTO city (namecity, codereg) VALUES ('Barcelona', 1);
INSERT INTO city (namecity, codereg) VALUES ('Buenos Aires', 2);
INSERT INTO city (namecity, codereg) VALUES ('Nureberg', 3);

INSERT INTO customer (namecustomer, lastnamecustomer, codecitycustomer, emailcustomer, birthdate, Ion, latitud) VALUES ('Rhonal', 'Velasco', 1, 'rhonalv@gmail.com', '1991-02-26', 'n20', 's50')