CREATE TABLE t_order(
  id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  total_price DECIMAL(19, 2) COMMENT '总金额',
  pay_status INT DEFAULT 0 COMMENT '支付状态',
  send_status INT DEFAULT 0 COMMENT '发货状态',
  pay_time DATETIME DEFAULT '1970-01-01' COMMENT '支付时间',
  send_time DATETIME DEFAULT '1970-01-01' COMMENT '发货时间',
  status INT DEFAULT 0 COMMENT '订单状态',
  create_time DATETIME NOT NULL COMMENT '创建时间'
) COMMENT '订单表';

CREATE TABLE t_order_detail(
  id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  order_id BIGINT NOT NULL COMMENT '订单ID',
  product_id BIGINT NOT NULL COMMENT '产品ID',
  product_name BIGINT NOT NULL COMMENT '产品名称',
  product_count INT NOT NULL COMMENT '产品数量',
  product_price DECIMAL(19, 2) NOT NULL COMMENT '单价',
  total_price DECIMAL(19, 2) NOT NULL COMMENT '总价',
  create_time DATETIME NOT NULL COMMENT '创建时间'
) COMMENT '订单详情';

DROP TABLE t_order_detail;

SELECT * FROM t_order;