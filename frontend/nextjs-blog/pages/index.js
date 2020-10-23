import Head from 'next/head'
import styles from '../styles/Home.module.css'
import { Layout, Menu  } from 'antd';

export default function Home() {
  const { Header, Content, Sider, Footer } = Layout;
  return (
      <Layout collapsedWidth = {1000}>
        <Sider
            breakpoint="lg"
            collapsedWidth="0"
            onBreakpoint={broken => {
              console.log(broken);
            }}
            onCollapse={(collapsed, type) => {
              console.log(collapsed, type);
            }}
        >
            <div  className="logo" >"Престиж logo"</div>

        </Sider>
        <Layout>
            <Header className="site-layout-sub-header-background-white" style={{ padding: 0 }} >
                "Cfkjy rhfcb ghtcnb;"
            </Header>
          <Content style={{ margin: '24px 16px 0' }}>
            <div className="site-layout-background" style={{ padding: 24, minHeight: 360 }}>
              content
            </div>
          </Content>
          <Footer style={{ textAlign: 'center' }}>Ant Design ©2018 Created by Ant UED</Footer>
        </Layout>
      </Layout>
  );
}
