<template>
    <Row type="flex" justify="center" align="middle" class="regist" @keydown.enter="submitRegist">
        <Col :xs="{span:22}" style="width: 368px;">
        <Row class="header">
            <img src="../../assets/xboot.png" width="220px" />
            <div class="description">EapBoot 企业应用平台</div>
        </Row>
    
        <Row class="success">
            <Icon type="md-checkmark-circle" color="#52c41a" size="64"></Icon>
            <p class="success-words">恭喜您，您的账户：{{username}} 注册成功</p>
            <Row class="buttons">
                <router-link to="/login">
                    <Button type="primary" size="large" style="margin-right:10px;">立即登录</Button>
                </router-link>
                <router-link to="/regist">
                    <Button size="large">返回注册</Button>
                </router-link>
            </Row>
        </Row>
    
        <Row class="foot">
            <Row type="flex" justify="space-around" class="code-row-bg help">
            </Row>
        </Row>
        </Col>
    </Row>
</template>

<script>
import Cookies from "js-cookie";
export default {
  data() {
    return {
      username: ""
    };
  },
  methods: {},
  mounted() {
    this.username = this.$route.query.username;
  }
};
</script>

<style lang="less">
@import "regist-result.less";
</style>
