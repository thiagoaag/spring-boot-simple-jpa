package br.com.zup.configuration;
//@ComponentScan(basePackages = "org.javers.spring.repository.mongo")
//@EnableAspectJAutoProxy
//@EnableMongoRepositories(basePackages = "org.javers.spring.repository.mongo")
public class JaversSpringMongoApplicationConfig {

    /**
     * Creates JaVers instance backed by {@link MongoRepository}
     */
//    @Bean
//    public Javers javers() {
//        MongoRepository javersMongoRepository = new MongoRepository(mongoDB());
//
//        return JaversBuilder.javers()
//                .registerJaversRepository(javersMongoRepository)
//                .build();
//    }
//
//    /**
//     * MongoDB setup
//     */
//    @Bean
//    public MongoDatabase mongoDB() {
//        return new Fongo("mydb").getDatabase("test");
//    }
//
//    /**
//     * Enables Repository auto-audit aspect. <br/>
//     *
//     * Use {@link org.javers.spring.annotation.JaversSpringDataAuditable}
//     * to annotate Spring Data Repositories
//     * or {@link org.javers.spring.annotation.JaversAuditable} for ordinary Repositories.
//     */
//    @Bean
//    public JaversAuditableRepositoryAspect javersAuditableRepositoryAspect() {
//        return new JaversAuditableRepositoryAspect(javers(), authorProvider(),
//                commitPropertiesProvider());
//    }
//
//    /**
//     * Required by auto-audit aspect. <br/><br/>
//     *
//     * Creates {@link SpringSecurityAuthorProvider} instance,
//     * suitable when using Spring Security
//     */
//    @Bean
//    public AuthorProvider authorProvider() {
//        return new SpringSecurityAuthorProvider();
//    }
//
//    /**
//     * Optional for auto-audit aspect.
//     */
//    @Bean
//    public CommitPropertiesProvider commitPropertiesProvider() {
//        return new CommitPropertiesProvider() {
//            @Override
//            public Map<String, String> provide() {
//                return ImmutableMap.of("key", "ok");
//            }
//        };
//    }
}

