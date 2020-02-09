INSERT INTO machine (key, name) VALUES
  ('flufferizer', 'The Flufferizer'),
  ('stufferizer', 'The Stufferizer'),
  ('wrapperizer', 'The Wrapperizer');

INSERT INTO machine_parameter (id, key, machine_key, name, type, unit) VALUES
(1, 'heat', 'flufferizer', 'Heat', 'real', 'joule'),
(2, 'moisture', 'flufferizer', 'Moisture', 'real', '%'),
(3, 'power', 'flufferizer', 'Power On', 'boolean', null),
(4, 'heat', 'stufferizer', 'Heat', 'real', 'joule'),
(5, 'stuffing', 'stufferizer', 'Stuffing', 'string', null),
(6, 'quantity', 'stufferizer', 'Quantity', 'int', '#'),
(7, 'power', 'stufferizer', 'Power On','boolean', null),
(8, 'heat', 'wrapperizer', 'Heat', 'real', 'joule'),
(9, 'glue', 'wrapperizer', 'Glue', 'string', null),
(10, 'power', 'wrapperizer', 'Power On', 'boolean', null);
