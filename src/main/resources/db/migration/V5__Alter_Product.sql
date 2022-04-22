ALTER TABLE db_tekton.product ADD CONSTRAINT self_product_category 
FOREIGN KEY (category_id) REFERENCES db_tekton.product_category (id);
ALTER TABLE db_tekton.product ADD CONSTRAINT self_product_inventory 
FOREIGN KEY (inventory_id) REFERENCES db_tekton.product_inventory (id);
ALTER TABLE db_tekton.product ADD CONSTRAINT self_discount 
FOREIGN KEY (discount_id) REFERENCES db_tekton.discount (id);
