
/*Table structure for table `tb_carousel` */

DROP TABLE IF EXISTS `tb_carousel`;

CREATE TABLE `tb_carousel` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `client_applet_id` int(10) DEFAULT NULL COMMENT '客户小程序id，用户获取用户小程序的轮播图',
  `own_applet_id` int(10) DEFAULT NULL COMMENT '自己小程序id，用户轮播绑定哪个小程序',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user` varchar(50) DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  `is_del` int(4) DEFAULT '0' COMMENT '是否删除，默认为否，0-否，1-是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '广告轮播表';

/*Table structure for table `tb_client_applet` */

DROP TABLE IF EXISTS `tb_client_applet`;

CREATE TABLE `tb_client_applet` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `link_ghid` varchar(50) DEFAULT NULL COMMENT '绑定盒子的小程序的ghid',
  `applet_name` varchar(50) DEFAULT NULL COMMENT '小程序名称',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `bottom_name` varchar(50) DEFAULT NULL COMMENT '盒子底部名字',
  `applet_appid` varchar(50) DEFAULT NULL COMMENT '客户小程序appid',
  `link_address` varchar(500) DEFAULT NULL COMMENT '客户小程序跳转链接',
  `isDisplay` tinyint(2) DEFAULT NULL COMMENT '是否显示，0是隐藏，1是显示',
  `logo_img` varchar(500) DEFAULT NULL COMMENT '小程序logo图片路径',
  `banner_img` varchar(500) DEFAULT NULL COMMENT '小程序广告图路径',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `create_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `update_user` varchar(50) DEFAULT NULL COMMENT '更新人',
  `is_del` int(4) DEFAULT '0' COMMENT '是否删除，默认为否，0-否，1-是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '客户小程序表';

/*Table structure for table `tb_own_applet` */

DROP TABLE IF EXISTS `tb_own_applet`;

CREATE TABLE `tb_own_applet` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `ghid` varchar(50) DEFAULT NULL COMMENT '小程序appid',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '小程序标题',
  `name` varchar(50) DEFAULT NULL COMMENT '小程序名字',
  `status` int(4) DEFAULT NULL COMMENT '状态，是否正常显示，0为骗审批，1为正常展示游戏界面',
  `is_box` int(4) DEFAULT NULL COMMENT '是否盒子，0-不是，1-是',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '跟新时间',
  `create_user` varchar(50) DEFAULT NULL COMMENT '创建用户',
  `update_user` varchar(50) DEFAULT NULL COMMENT '更新用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '自己小程序表';

/*Table structure for table `tb_pv_click` */

DROP TABLE IF EXISTS `tb_pv_click`;

CREATE TABLE `tb_pv_click` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `client_applet_id` varchar(100) DEFAULT NULL COMMENT '客户小程序id',
  `click_count` int(20) DEFAULT NULL COMMENT '每天的点击量，点击一次则加1',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '记录用户pv点击量表';

/*Table structure for table `tb_type_own_applet` */

DROP TABLE IF EXISTS `tb_type_own_applet`;

CREATE TABLE `tb_type_own_applet` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `client_applet_id` int(10) DEFAULT NULL COMMENT '客户小程序列表id',
  `type_id` int(10) DEFAULT NULL COMMENT '类型id',
  `serial_number` int(10) DEFAULT NULL COMMENT '序列号',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `create_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `update_user` varchar(50) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '自己小程序表';

/*Table structure for table `tb_types` */

DROP TABLE IF EXISTS `tb_types`;

CREATE TABLE `tb_types` (
  `id` int(10) DEFAULT NULL COMMENT '主键id',
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `logo_url` varchar(500) DEFAULT NULL COMMENT '分类logo',
  `serial_number` int(10) DEFAULT NULL COMMENT '序号',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `create_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `update_user` varchar(50) DEFAULT NULL COMMENT '更新人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '分类表：客户小程序需要归到哪个类目';

/*Table structure for table `tb_uv_click` */

DROP TABLE IF EXISTS `tb_uv_click`;

CREATE TABLE `tb_uv_click` (
  `id` int(10) NOT NULL COMMENT '表主键',
  `openid` varchar(100) DEFAULT NULL COMMENT '用户的唯一标识',
  `ghid` varchar(100) DEFAULT NULL COMMENT '小程序的唯一标识',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '记录用户uv点击量表，记录用户的点击信息，用户去重';

  CREATE TABLE `tb_api_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `nick_name` varchar(64) DEFAULT NULL COMMENT '微信昵称',
  `wechat_num` varchar(64) DEFAULT NULL COMMENT '微信号',
  `oppen_id` varchar(128) DEFAULT NULL COMMENT '微信唯一标识',
  `wechat_phone_num` varchar(16) DEFAULT NULL COMMENT '微信关联电话号码',
  `user_bind_phone_num` varchar(16) DEFAULT NULL COMMENT '用户绑定电话号码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `user_head_image` varchar(512) DEFAULT NULL COMMENT '用户头像',
  `referrer_oppen_id` varchar(128) DEFAULT NULL COMMENT '推荐人id',
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8



