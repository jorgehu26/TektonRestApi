CREATE TABLE `db_tekton`.`product_category` (
  `id` INT(11) NOT NULL auto_increment,
  `name` VARCHAR(100) NOT NULL,
  `descrip` VARCHAR(200) NOT NULL,
  `created` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `modified` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));
