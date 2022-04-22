CREATE TABLE `db_tekton`.`product_inventory` (
  `id` INT(11) NOT NULL auto_increment,
  `quantity` INT(11),
  `created` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `modified` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));