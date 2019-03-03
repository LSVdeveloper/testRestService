---заполнение холдингов
insert into holding(holding_id, holding_title) values(1, 'holding1');
insert into holding(holding_id, holding_title) values(2, 'holding2');

---заполнение holding_counter
insert into holding_counter(holding_id, count) values(1, 484);
insert into holding_counter(holding_id, count) values(2, 346);

---заполнение site
insert into site(site_id, site_title) values(3, 'site1');
insert into site(site_id, site_title) values(4, 'site2');

---заполнение reach
insert into reach(holding_id, site_id, reach_percent) values(2, 3, 6.25);
insert into reach(holding_id, site_id, reach_percent) values(1, 4, 7.36);