CREATE TABLE company (
id_company SERIAL NOT NULL,
  name_company character varying(100) DEFAULT NULL,
  brand character varying(100) NOT NULL,
  rfc character varying(35) NOT NULL,
  website character varying(45) DEFAULT NULL,
  company_isactive numeric(1,0) NOT NULL,
  name_bank character varying(100) NOT NULL,
  number_acount character varying(100) NOT NULL,
  interbank_clabe character varying(100) NOT NULL,
  sucursal_name character varying(100) DEFAULT NULL,
  record_date date NOT NULL,
  business character varying(100) DEFAULT NULL,
  id_update_actions numeric(5,0) NOT NULL,
  progress_profile numeric(11,0) DEFAULT 0,
  cust_type numeric(1,0) NOT NULL DEFAULT 0,
  isprospect numeric(1,0) NOT NULL DEFAULT 0,
  ishost numeric(1,0) DEFAULT 0,
  interestingin character varying(500) DEFAULT NULL,
  type_client numeric(11,0) NOT NULL DEFAULT 0,
  CONSTRAINT primary_key_company PRIMARY KEY (id_company)
);