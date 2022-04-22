CREATE TABLE `db_tekton`.`product` (
  `id` INT(11) NOT NULL auto_increment,
  `name` VARCHAR(100) NOT NULL,
  `descrip` VARCHAR(200) NOT NULL,
  `sku` VARCHAR(50) NOT NULL,
  `price` DECIMAL(20,6) NOT NULL,
  `category_id` INT(11),
  `discount_id` INT(11),
  `inventory_id` INT(11),
  `created` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `modified` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`))