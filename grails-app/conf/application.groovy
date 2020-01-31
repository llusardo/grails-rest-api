

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'grails.rest.api.auth.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'grails.rest.api.auth.UserRole'
grails.plugin.springsecurity.authority.className = 'grails.rest.api.auth.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/api/v1/auth/logout', access: ['isAuthenticated()']],
	[pattern: '/login/auth', access: ['denyAll']] //lock down spring security login form url
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'grails.rest.api.security.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'grails.rest.api.security.UserRole'
grails.plugin.springsecurity.authority.className = 'grails.rest.api.security.Role'


grails.plugin.springsecurity.filterChain.chainMap = [
	//Stateless chain
	[
			pattern: '/**',
			filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter'
	]
]

//Spring security configuration, more information http://alvarosanchez.github.io/grails-spring-security-rest/latest/docs/
//"Authorization: Bearer <token>" is the default header to be passed
grails.plugin.springsecurity.rest.token.storage.useGorm = true
grails.plugin.springsecurity.rest.token.storage.gorm.tokenDomainClassName = 'grails.rest.api.security.AuthenticationToken'
//grails.plugin.springsecurity.rest.token.validation.useBearerToken = false
//grails.plugin.springsecurity.rest.token.validation.headerName = 'X-Auth-Token'
grails.plugin.springsecurity.rest.login.active=true
grails.plugin.springsecurity.rest.login.failureStatusCode=401
grails.plugin.springsecurity.rest.login.endpointUrl='/api/v1/auth/login'
grails.plugin.springsecurity.rest.logout.endpointUrl='/api/v1/auth/logout'
grails.plugin.springsecurity.rest.token.validation.active=true
////grails.plugin.springsecurity.rest.token.validation.headerName
grails.plugin.springsecurity.rest.token.validation.endpointUrl='/api/v1/auth/validate'
