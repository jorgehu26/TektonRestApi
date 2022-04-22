CREATE TABLE `db_tekton`.`discount` (
  `id` INT(11) NOT NULL auto_increment,
  `name` VARCHAR(100) NOT NULL,
  `descrip` VARCHAR(200) NOT NULL,
  `discount_percent` DECIMAL(10,6),
  `active` TINYINT(4),
  `created` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `modified` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));
