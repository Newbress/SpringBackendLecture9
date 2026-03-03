-- members
insert into members (id, email, name) values
                                          (1, 'a@test.com', '회원A'),
                                          (2, 'b@test.com', '회원B');

-- stamps (member_id unique)
insert into stamps (id, member_id, stamp_count) values
                                                    (1, 1, 0),
                                                    (2, 2, 3);

-- coffees
insert into coffees (id, name, price) values
                                          (1, '아메리카노', 4500),
                                          (2, '라떼', 5000),
                                          (3, '바닐라라떼', 5500),
                                          (4, '콜드브루', 6000);