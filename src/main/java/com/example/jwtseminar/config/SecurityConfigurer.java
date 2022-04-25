//package config;
//
//
////import com.example.namtn.demo.filters.JwtRequestFilter;
//import filter.JwtRequestFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//public class SecurityConfigurer extends WebSecurityConfigurerAdapter {
//
////    @Autowired
////    private MyUserDetailsService myUserDetailService;
////
////    @Autowired
////    private JwtRequestFilter jwtRequestFilter;
//
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(myUserDetailService);
////    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        http.csrf().disable().authorizeRequests()
////                .antMatchers("/authenticate",
////                        "/h2-console/**",
////                        "/v2/api-docs",
////                        "/configuration/ui",
////                        "/swagger-resources/**",
////                        "/configuration/security",
////                        "/swagger-ui.html",
////                        "/webjars/**")
////                .permitAll()
////                .anyRequest()
////                .authenticated()
////                .and().sessionManagement()
////                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
////        http.headers().frameOptions().disable();
//
////        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
//        http.authorizeRequests()
//                .anyRequest().permitAll();
//
//    }
//
////    @Override
////    @Bean
////    public AuthenticationManager authenticationManagerBean() throws Exception {
////        return super.authenticationManagerBean();
////    }
////
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return NoOpPasswordEncoder.getInstance();
////    }
//}
